class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0, n = nums.length;
        int res = nums[0];
        int max = 1;

        for(int right =1; right<n; right++){
            while((res ^ nums[right]) != (res | nums[right])){
                res ^= nums[left++];
            }
            res |= nums[right];
            max = Math.max(max, right-left+1);
        }

        return max;
    }
}