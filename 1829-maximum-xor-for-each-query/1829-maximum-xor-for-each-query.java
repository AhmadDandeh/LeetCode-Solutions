class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] ans  = new int[n];
        int max = (1 << maximumBit)-1;

        int xor = 0;
        for(int i =0; i<n; i++){
            xor ^= nums[i];
            ans[n-1-i] = max^xor;
        }
        return ans;
    }
}