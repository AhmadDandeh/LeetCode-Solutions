class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length-1;
        int ans = 0;
        while(l<r) ans = Math.max(ans, nums[l++] + nums[r--]);
        return ans;
    }
}