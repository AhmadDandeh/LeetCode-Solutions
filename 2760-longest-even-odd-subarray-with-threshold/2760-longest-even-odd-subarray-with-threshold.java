class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int ans =0;

        for(int left =0; left<nums.length; left++){
            if((nums[left]&1) == 0 && nums[left]<= threshold){
                int right = left+1;
                while(right<nums.length && nums[right] <= threshold && (nums[right-1]&1) != (nums[right]&1)){
                    right++;
                }
                ans = Math.max(ans,right-left);
                left = right-1;
            }
        }
        return ans;
    }
}