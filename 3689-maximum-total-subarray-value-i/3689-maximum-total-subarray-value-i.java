class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length, max = nums[0], min = nums[0];
        for(int i=1; i<n; i++){
            if(nums[i]> max) max = nums[i];
            else if(nums[i]<min) min = nums[i];
        }
        long diff = max - min;
        return k * diff;
    }
}