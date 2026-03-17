class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1;
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] <= nums[i-1]){
                ans =Math.max(ans, count);
                count = 1;
            }
            else count++;
        }
        return Math.max(ans, count);
    }
}