class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int ans = 0;
        int m = grid.length, n = grid[0].length;

        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if (i > 0) grid[i][j] += grid[i - 1][j];
                if (j > 0) grid[i][j] += grid[i][j - 1];
                if (i > 0 && j > 0) grid[i][j] -= grid[i - 1][j - 1];

                if (grid[i][j] <= k) ans++;
                else break;
            }
        }
        return ans;
    }
}