class Solution {
    public int maximumTop(int[] nums, int k) {
        if(k == 0) return nums[0];
        int n = nums.length;
        if (n == 1) return ((k&1) == 0) ? nums[0] : -1;
        if (k == 1) return nums[1];

        int max = nums[0];
        for(int i =1; i<k-1 && i<n; i++) max = Math.max(max, nums[i]);
        if(k<n) return Math.max(max, nums[k]);
        else return max;
    }
}