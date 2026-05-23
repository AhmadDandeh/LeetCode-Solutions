class Solution {
    // dp[i] = dp[i-1] + dp[i-2];
    /*
    // Normal Recursion
    public int climbStairs(int n) {
        if(n < 0) return 0;
        if(n == 0) return 1;
        return climbStairs(n-1) + climbStairs(n-2);
    }
    */

    /*
    // Memorization with HashMap
    HashMap<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(map.containsKey(n)) return map.get(n);
        int sum = 0;
        if(n < 0) sum = 0;
        else if(n == 0) sum = 1;
        else sum = climbStairs(n-1) + climbStairs(n-2);
        map.put(n, sum);
        return sum;
    }
    */

    /*
    // Memorization with Array
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1); // init the array
        return solve(n);
    }
    private int solve(int n) {
        // Base Cases
        if (n < 0) return 0;
        if (n == 0) return 1;
        // Look-up
        if (memo[n] != -1) return memo[n];
        // Compute & Store
        memo[n] = solve(n - 1) + solve(n - 2);
        return memo[n];
    }

    /*
    // Tabulation with array
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i =2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    */
    // Tabulation with two values, we need just the previous two values
    public int climbStairs(int n) {
        if(n == 0) return 0;
        int x1 = 1;
        int x2 = 1;
        for(int i =2; i<=n; i++){
            int x3 = x2 + x1;
            x1 = x2;
            x2 = x3;
        }
        return x2;
    }
}