class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length == 1) return 1;
        int ans = 2;
        int count = 2;
        for(int i = 2; i<nums.length; i++){
            if(nums[i] == nums[i-1] + nums[i-2]) count++;
            else count = 2;
            ans = Math.max(ans, count);
        }
        return ans;
    }
}