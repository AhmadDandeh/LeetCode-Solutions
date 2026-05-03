class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k == 1) return 0;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i =k-1; i<n; i++) ans = Math.min(ans, nums[i]-nums[i-k+1]);
        return ans;
    }
}