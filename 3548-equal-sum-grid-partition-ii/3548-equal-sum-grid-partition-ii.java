class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long totalSum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) totalSum += grid[i][j];
        }

        // 1. فحص القطع الأفقي
        if (m > 1 && checkHorizontal(grid, m, n, totalSum)) return true;
        
        // 2. فحص القطع الرأسي
        if (n > 1 && checkVertical(grid, m, n, totalSum)) return true;

        return false;
    }

    private boolean checkHorizontal(int[][] grid, int m, int n, long totalSum) {
        int[] topFreq = new int[100001];
        int[] botFreq = new int[100001];
        long topSum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) botFreq[grid[i][j]]++;
        }

        for (int i = 0; i < m - 1; i++) { // القطع بعد الصف i
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                topSum += val;
                topFreq[val]++;
                botFreq[val]--;
            }
            long botSum = totalSum - topSum;
            int h1 = i + 1, h2 = m - h1;

            if (validate(topSum, botSum, topFreq, botFreq, h1, n, h2, n, grid, i, true)) return true;
        }
        return false;
    }

    private boolean checkVertical(int[][] grid, int m, int n, long totalSum) {
        int[] leftFreq = new int[100001];
        int[] rightFreq = new int[100001];
        long leftSum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) rightFreq[grid[i][j]]++;
        }

        for (int j = 0; j < n - 1; j++) { // القطع بعد العمود j
            for (int i = 0; i < m; i++) {
                int val = grid[i][j];
                leftSum += val;
                leftFreq[val]++;
                rightFreq[val]--;
            }
            long rightSum = totalSum - leftSum;
            int w1 = j + 1, w2 = n - w1;

            if (validate(leftSum, rightSum, leftFreq, rightFreq, m, w1, m, w2, grid, j, false)) return true;
        }
        return false;
    }

    private boolean validate(long s1, long s2, int[] f1, int[] f2, int h1, int w1, int h2, int w2, int[][] grid, int cutIdx, boolean isHoriz) {
        if (s1 == s2) return true;
        long diff = s1 - s2;

        // الحالة 1: الحذف من القسم الأول
        if (diff > 0 && diff <= 100000) {
            int target = (int) diff;
            if (f1[target] > 0) {
                if (h1 > 1 && w1 > 1) return true; // بلوك: أي عنصر مسموح
                if (isHoriz) { // صف واحد (h1=1)
                    if (target == grid[0][0] || target == grid[0][w1 - 1]) return true;
                } else { // عمود واحد (w1=1)
                    if (target == grid[0][0] || target == grid[grid.length - 1][0]) return true;
                }
            }
        } 
        // الحالة 2: الحذف من القسم الثاني
        else if (diff < 0) {
            int target = (int) Math.abs(diff);
            if (target <= 100000 && f2[target] > 0) {
                if (h2 > 1 && w2 > 1) return true; // بلوك: أي عنصر مسموح
                if (isHoriz) { // صف واحد ناتج عن قطع أفقي (الصف الأخير)
                    if (target == grid[grid.length - 1][0] || target == grid[grid.length - 1][w2 - 1]) return true;
                } else { // عمود واحد ناتج عن قطع رأسي (العمود الأخير)
                    if (target == grid[0][grid[0].length - 1] || target == grid[grid.length - 1][grid[0].length - 1]) return true;
                }
            }
        }
        return false;
    }
}