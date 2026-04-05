class Solution {
    public void moveZeroes(int[] nums) {
        int zeroI = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[zeroI] = nums[i];
                zeroI++;
            }
        }
        for(; zeroI<nums.length; zeroI++) nums[zeroI] = 0;
    }
}