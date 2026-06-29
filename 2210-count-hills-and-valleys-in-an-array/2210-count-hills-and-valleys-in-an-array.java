class Solution {
    public int countHillValley(int[] nums) {
        int ans = 0, n = nums.length-1, prev = nums[0];
        for(int i =1; i<n; i++){
            if(nums[i] == prev || nums[i] == nums[i+1]) continue;
            if(nums[i]> prev && nums[i]>nums[i+1]) ans++;
            if(nums[i]< prev && nums[i]<nums[i+1]) ans++;
            prev = nums[i];
        }
        return ans;
    }
}