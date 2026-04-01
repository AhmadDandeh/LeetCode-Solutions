class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int j = i;
            while (j < i + k - 1 && nums[j + 1] - nums[j] == 1) {
                j++;
            }
            ans[i] = (j == i + k - 1) ? nums[i + k - 1] : -1;
        }

        return ans;
    }
}