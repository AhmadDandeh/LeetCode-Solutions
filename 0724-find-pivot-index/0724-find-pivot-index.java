class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length, l = 0, r = 0;
        for(int i=0; i<n; i++) r += nums[i];
        for(int i=0; i<n; i++){
            r -= nums[i];
            if(l == r) return i;
            l += nums[i];
        }
        return -1;
    }
}