class Solution {
    public int removeElement(int[] nums, int val) {
        int index = -1;
        for(int i=0; i< nums.length; i++){
            if(nums[i] != val){
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }
}