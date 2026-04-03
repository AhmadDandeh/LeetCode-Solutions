class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
            }
        }

        return dp[0];
    }

    /*
    // In-place
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size()-2; i>=0; i--){
            for (int j = 0; j <= i; j++) {
                int bestBelow = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, triangle.get(i).get(j) + bestBelow);
            }
        }

        return triangle.get(0).get(0);
    }
    */
}