class Solution {
    public int minOperations(int[] nums, int k) {
        for(int num:nums){
            k ^= num;
        }
        return Integer.bitCount(k);
    }
}