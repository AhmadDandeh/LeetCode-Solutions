class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        dp[0] = 0;
        dp[1] = Integer.MIN_VALUE;
        dp[2] = Integer.MIN_VALUE;

        for(int num: nums){
            int[] next = new int[3];
            next[0] = dp[0];
            next[1] = dp[1];
            next[2] = dp[2];

            int r = num % 3;
            for(int i = 0; i<3; i++){
                if(dp[i] == Integer.MIN_VALUE) continue;
                int x = (i+r)%3;
                next[x] = Math.max(next[x], dp[i]+num);
            }
            dp = next;
        }
        return dp[0];
    }
}