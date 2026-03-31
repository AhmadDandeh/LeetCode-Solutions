class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0, r =0, max = 0;
        for(; r<n; r++){
            while((long) nums[l]*k<nums[r]){
                max = Math.max(max, r-l);
                l++;
            }
        }
        max = Math.max(max, r-l);
        return n - max;
    }
}