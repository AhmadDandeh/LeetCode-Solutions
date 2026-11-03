class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0], sum = nums[0];
        for(int i=1; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }
        return max * nums.length - sum;
    }
}