class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i<n; i++){
            if(obstacleGrid[0][i] == 0) dp[i] = dp[i-1];
        }
        for(int i = 1; i<m; i++){
            if(obstacleGrid[i][0] == 1) dp[0] = 0;
            for(int j = 1; j<n; j++){
                if(obstacleGrid[i][j] == 0) dp[j] += dp[j-1];
                else dp[j] = 0;
            }
        }

        return dp[n-1];
    }
}