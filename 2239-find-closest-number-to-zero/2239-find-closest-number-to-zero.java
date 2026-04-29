class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];
        int min = Math.abs(ans);
        for(int i =1; i<nums.length; i++){
            int x = Math.abs(nums[i]);
            if(x < min){
                min = x;
                ans = nums[i];
            }
            else if(x == min) ans = Math.max(ans, nums[i]);
        }
        return ans;
    }
}