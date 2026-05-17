class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = 0;
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        
        int longest = 0;
        int currentStreak = 0;
        for (int num : nums) {
            if (num == maxVal) {
                currentStreak++;
                longest = Math.max(longest, currentStreak);
            } else {
                currentStreak = 0;
            }
        }
        
        return longest;
    }
}