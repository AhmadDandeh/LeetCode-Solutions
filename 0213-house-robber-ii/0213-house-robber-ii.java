class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
    
        return Math.max(tabu(nums, 0, n - 2), tabu(nums, 1, n - 1));
    }

    private int tabu(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0;
        for (int i = start; i <= end; i++) {
            int temp = prev1;
            prev1 = Math.max(prev1, prev2 + nums[i]);
            prev2 = temp;
        }
        return prev1;
    }

    /**
     * The logic of keeping 2 houses is correct, but we have more edge cases,
     * We can simplify it with the above tabulation solution 
     */
    /*
    // Tabulation with variables
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 2) return Math.max(nums[0], nums[1]);
        if(n == 3) return Math.max(nums[0], Math.max(nums[1], nums[2]));
        return Math.max(tabu(nums, 0, n-2), tabu(nums, 1, n-1));
    }

    private int tabu(int[] nums, int pos, int limit){
        int n = nums.length;
        int x1 = nums[pos];
        int x2 = nums[pos+1];
        int x3 = nums[pos] + nums[pos+2];
        for(int i = pos+2; i<limit; i++){
            int x4 = Math.max(x1, x2) + nums[i];
            x1 = x2;
            x2 = x3;
            x3 = x4;
        }
        return x3;
    }
    */

    /*
    // Tabulation with array
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 2) return Math.max(nums[0], nums[1]);
        if(n == 3) return Math.max(nums[0], Math.max(nums[1], nums[2]));
        return Math.max(tabu(nums, 0, n-2), tabu(nums, 1, n-1));
    }

    private int tabu(int[] nums, int pos, int limit){
        int n = nums.length;
        int[] dp = new int[n];
        dp[pos] = nums[pos];
        dp[pos+1] = nums[pos+1];
        dp[pos+2] = nums[pos] + nums[pos+2];
        for(int i = pos+2; i<limit; i++){
            dp[i] = Math.max(dp[i-2], dp[i-3]) + nums[i];
        }
        return dp[limit];
    }
    */

    /*
    // Memo
    int[] memo;
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 3) return Math.max(nums[0], Math.max(nums[1], nums[2]));
        memo = new int[n];
        Arrays.fill(memo, -1);
        return Math.max(rec(nums, 0, n-1), rec(nums, 1, n));
    }

    private int rec(int[] nums, int pos, int limit){
        if(pos>=limit) return 0;
        if(memo[pos] == -1) memo[pos] = Math.max(rec(nums, pos+2, limit), rec(nums, pos+3, limit)) + nums[pos];
        return memo[pos];
    }
    */

    /*
    // Recursion
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 3) return Math.max(nums[0], Math.max(nums[1], nums[2]));
        return Math.max(rec(nums, 0, n-1), rec(nums, 1, n));
    }

    private int rec(int[] nums, int pos, int limit){
        if(pos>=limit) return 0;
        return Math.max(rec(nums, pos+2, limit), rec(nums, pos+3, limit)) + nums[pos];
    }
    */
}