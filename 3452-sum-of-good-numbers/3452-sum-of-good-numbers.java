class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int ans = 0;
        for(int i =0; i<nums.length; i++){
            boolean leftGood = (i - k < 0 || nums[i] > nums[i - k]);
            boolean rightGood = (i + k >= nums.length || nums[i] > nums[i + k]);
            if (leftGood && rightGood) ans += nums[i];
        }
        return ans;
    }
}