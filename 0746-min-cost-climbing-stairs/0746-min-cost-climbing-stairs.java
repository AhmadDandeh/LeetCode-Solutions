class Solution {
    // dp[i] = Math.min(dp[i-2], dp[i-1]) + cost[i];
    /*
    // Normal Recursion
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(rec(cost, cost.length-1), rec(cost, cost.length-2));
    }

    public int rec(int[] cost, int index) {
        if(index < 0) return 0;
        return Math.min(rec(cost, index-1), rec(cost, index-2)) + cost[index];
    }
    */

    /*
    // Memorization
    int[] memo;
    public int minCostClimbingStairs(int[] cost) {
        memo = new int[cost.length+1];
        Arrays.fill(memo, -1);
        return Math.min(rec(cost, cost.length-1), rec(cost, cost.length-2));
    }

    public int rec(int[] cost, int index) {
        if(index < 0) return 0;
        if(memo[index] != -1) return memo[index];
        memo[index] = Math.min(rec(cost, index-1), rec(cost, index-2)) + cost[index];
        return memo[index];
    }
    */
    /*
    // Tabulation with an array
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i< cost.length; i++){
            dp[i] = Math.min(dp[i-2], dp[i-1]) + cost[i];
        }
        return Math.min(dp[cost.length-1], dp[cost.length-2]);
    }
    */
    
    // Tabulation with two variables
    public int minCostClimbingStairs(int[] cost) {
        int x1 = cost[0];
        int x2 = cost[1];
        for(int i = 2; i< cost.length; i++){
            int x3 = Math.min(x1, x2) + cost[i];
            x1 = x2;
            x2 = x3;
        }
        return Math.min(x1, x2);
    }
}