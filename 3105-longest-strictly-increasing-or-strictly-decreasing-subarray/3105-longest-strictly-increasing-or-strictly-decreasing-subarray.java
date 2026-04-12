class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 1;
        int countS = 1, countB = 1;
        for(int i =1; i< nums.length; i++){
            if(nums[i] > nums[i-1]) countB++;
            else countB = 1;
            if(nums[i] < nums[i-1]) countS++;
            else countS = 1;
            ans = Math.max(ans, Math.max(countS, countB));
        }
        return ans;
    }
}