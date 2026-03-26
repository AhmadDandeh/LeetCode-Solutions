class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long totalSum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) totalSum += grid[i][j];
        }

        // 1. Horizontal Cut Check
        if (m > 1) {
            int[] topFreq = new int[100001];
            int[] botFreq = new int[100001];
            long topSum = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) botFreq[grid[i][j]]++;
            }

            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n; j++) {
                    int val = grid[i][j];
                    topSum += val;
                    topFreq[val]++;
                    botFreq[val]--;
                }
                long botSum = totalSum - topSum;
                // Check Top Section (Rows 0 to i) and Bottom Section (Rows i+1 to m-1)
                if (isValid(topSum, botSum, topFreq, i + 1, n, grid, 0, i, 0, n - 1)) return true;
                if (isValid(botSum, topSum, botFreq, m - 1 - i, n, grid, i + 1, m - 1, 0, n - 1)) return true;
            }
        }

        // 2. Vertical Cut Check
        if (n > 1) {
            int[] leftFreq = new int[100001];
            int[] rightFreq = new int[100001];
            long leftSum = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) rightFreq[grid[i][j]]++;
            }

            for (int j = 0; j < n - 1; j++) {
                for (int i = 0; i < m; i++) {
                    int val = grid[i][j];
                    leftSum += val;
                    leftFreq[val]++;
                    rightFreq[val]--;
                }
                long rightSum = totalSum - leftSum;
                // Check Left Section (Cols 0 to j) and Right Section (Cols j+1 to n-1)
                if (isValid(leftSum, rightSum, leftFreq, m, j + 1, grid, 0, m - 1, 0, j)) return true;
                if (isValid(rightSum, leftSum, rightFreq, m, n - 1 - j, grid, 0, m - 1, j + 1, n - 1)) return true;
            }
        }
        return false;
    }

    private boolean isValid(long s1, long s2, int[] freq, int h, int w, int[][] grid, int r1, int r2, int c1, int c2) {
        if (s1 == s2) return true;
        long diff = s1 - s2;
        if (diff <= 0 || diff > 100000) return false;
        
        int target = (int) diff;
        if (freq[target] == 0) return false;
        if (h * w <= 1) return false; // Must remain non-empty

        // Connectivity Rule:
        // 1. In a block (h > 1 and w > 1), removing any cell keeps it connected.
        if (h > 1 && w > 1) return true;
        // 2. In a single row, only ends are removable.
        if (h == 1) return (grid[r1][c1] == target || grid[r1][c2] == target);
        // 3. In a single column, only ends are removable.
        if (w == 1) return (grid[r1][c1] == target || grid[r2][c1] == target);
        
        return false;
    }
}