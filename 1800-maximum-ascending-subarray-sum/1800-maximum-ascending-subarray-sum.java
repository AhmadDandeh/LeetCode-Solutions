class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0], prevMax =nums[0], curr = nums[0];
        for(int i =1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                prevMax += nums[i];
            }
            else{
                prevMax = nums[i];
            }
            max = Math.max(max, prevMax);
        }
        return max;
    }
}