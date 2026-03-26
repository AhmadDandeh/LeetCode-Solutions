class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long totalSum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) totalSum += grid[i][j];
        }

        if (m > 1) {
            long upSum = 0;
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n; j++) upSum += grid[i][j];
                long downSum = totalSum - upSum;
                if (check(upSum, downSum, grid, 0, i, 0, n - 1)) return true;
                if (check(downSum, upSum, grid, i + 1, m - 1, 0, n - 1)) return true;
            }
        }

        if (n > 1) {
            long leftSum = 0;
            for (int j = 0; j < n - 1; j++) {
                for (int i = 0; i < m; i++) leftSum += grid[i][j];
                long rightSum = totalSum - leftSum;
                if (check(leftSum, rightSum, grid, 0, m - 1, 0, j)) return true;
                if (check(rightSum, leftSum, grid, 0, m - 1, j + 1, n - 1)) return true;
            }
        }
        return false;
    }

    private boolean check(long s1, long s2, int[][] grid, int r1, int r2, int c1, int c2) {
        if (s1 == s2) return true;
        long diff = s1 - s2;
        if (diff < 0 || diff > 1000000) return false; 

        int target = (int) diff;
        int h = r2 - r1 + 1;
        int w = c2 - c1 + 1;
        
        if (h > 1 && w > 1) {
            for (int i = r1; i <= r2; i++) {
                for (int j = c1; j <= c2; j++) {
                    if (grid[i][j] == target) return true;
                }
            }
        } else if (h == 1) {
            if (grid[r1][c1] == target || grid[r1][c2] == target) return true;
        } else if (w == 1) {
            if (grid[r1][c1] == target || grid[r2][c1] == target) return true;
        }
        return false;
    }
}