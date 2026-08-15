class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean zeros = true;
        for(int num:nums){
            xor ^= num;
            if(zeros && num != 0) zeros = false;
        }
        if(xor != 0) return nums.length;
        else if(!zeros) return nums.length - 1;
        else return 0;
    }
}