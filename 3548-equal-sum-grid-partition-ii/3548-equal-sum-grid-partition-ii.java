class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long totalSum = 0;
        for (int[] row : grid) for (int v : row) totalSum += v;

        if (m > 1 && check(grid, m, n, totalSum, true)) return true;
        if (n > 1 && check(grid, n, m, totalSum, false)) return true;

        return false;
    }

    private boolean check(int[][] grid, int dim1, int dim2, long totalSum, boolean horizontal) {
        int[] freq1 = new int[100001];
        int[] freq2 = new int[100001];
        long sum1 = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                freq2[grid[i][j]]++;
            }
        }

        for (int i = 0; i < dim1 - 1; i++) {
            for (int j = 0; j < dim2; j++) {
                int val = horizontal ? grid[i][j] : grid[j][i];
                sum1 += val;
                freq1[val]++;
                freq2[val]--;
            }

            long sum2 = totalSum - sum1;
            if (sum1 == sum2) return true;

            long diff = sum1 - sum2;
            if (diff > 0) {
                if (diff <= 100000 && freq1[(int)diff] > 0) {
                    if (isValid(grid, (int)diff, i + 1, dim2, i, horizontal, true)) return true;
                }
            }
            else {
                long target = -diff;
                if (target <= 100000 && freq2[(int)target] > 0) {
                    if (isValid(grid, (int)target, dim1 - (i + 1), dim2, i + 1, horizontal, false)) return true;
                }
            }
        }
        return false;
    }

    private boolean isValid(int[][] grid, int target, int h, int w, int startIdx, boolean horizontal, boolean isFirstPart) {
        if (h > 1 && w > 1) return true;

        if (horizontal) {
            int r = isFirstPart ? 0 : grid.length - 1;
            return (grid[r][0] == target || grid[r][grid[0].length - 1] == target);
        } 
        else {
            int c = isFirstPart ? 0 : grid[0].length - 1;
            return (grid[0][c] == target || grid[grid.length - 1][c] == target);
        }
    }
}