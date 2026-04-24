class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 0;
        right[n-1] = 0;
        for(int i =1; i<n;i++){
            left[i] = nums[i-1] + left[i-1];
            right[n-1-i] = nums[n-i] + right[n-i];
        }

        for(int i =0; i<n;i++){
            left[i] = Math.abs(right[i] - left[i]);
        }
        return left;
    }
}