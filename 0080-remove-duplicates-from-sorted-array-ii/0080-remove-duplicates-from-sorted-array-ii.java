class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3) return nums.length;
        int read = 2, write = 2;
        
        for(; read<nums.length; read++){
            if(nums[read] != nums[write - 2]){
                nums[write++] = nums[read];
            }
        }
        return write;
    }
}