class Solution {
    public int maxSubArray(int[] nums) {
        // Kadande Algorithm, DP
        int maxSum = nums[0];
        int ans = maxSum;
        for(int i =1; i<nums.length; i++){
            maxSum = Math.max(nums[i], nums[i]+maxSum);
            ans = Math.max(ans, maxSum);
        }
        return ans;
    }
}