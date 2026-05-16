class Solution {
    public int maxProduct(int[] nums) {
        int max1 = nums[0]>nums[1]? nums[0]: nums[1];
        int max2 = nums[0]>nums[1]? nums[1]: nums[0];

        for(int i =2; i<nums.length; i++){
            if(nums[i]> max1){
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i]>max2) max2 = nums[i];
        }
        return (max1-1)*(max2-1);
    }
}