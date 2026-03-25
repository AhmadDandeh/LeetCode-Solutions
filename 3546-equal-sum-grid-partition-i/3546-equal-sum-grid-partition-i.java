class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long[] rowSums = new long[m];
        long[] colSums = new long[n];
        long target = 0;
        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                rowSums[i] += grid[i][j];
                colSums[j] += grid[i][j];
                target += grid[i][j];
            }
        }
        if((target&1) == 1) return false;
        target /= 2;
        long currentHorizontalSum = 0;
        for (int i = 0; i < m - 1; i++) {
            currentHorizontalSum += rowSums[i];
            if (currentHorizontalSum == target) return true;
        }

        long currentVerticalSum = 0;
        for (int i = 0; i < n - 1; i++) {
            currentVerticalSum += colSums[i];
            if (currentVerticalSum == target) return true;
        }
        return false;
    }
}