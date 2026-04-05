class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
    
        // Sum of first window of size k
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        int windowSum = maxSum;

        for (int i = k; i < nums.length; i++) {
            // Slide the window: remove left, add right
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}