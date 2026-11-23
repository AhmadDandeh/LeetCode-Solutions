class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0, r = 0;
        for(int num:nums) r += num;
        for(int i=0; i<n; i++){
            ans[i] = i*nums[i] - l + r - (n-i)*nums[i];
            l += nums[i];
            r -= nums[i];
        }
        return ans;
    }
}