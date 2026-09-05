class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] preMax = new int[n], preMin = new int[n];
        preMax[0] = nums[0];
        preMin[n-1] = nums[n-1];
        for(int i = 1; i<n; i++){
            preMax[i] = Math.max(preMax[i-1], nums[i]);
            preMin[n-i-1] = Math.min(preMin[n-i], nums[n-i-1]);
        }
        for(int i = 0; i<n; i++){
            if(preMax[i] - preMin[i] <= k){
                return i;
            }
        }
        return -1;
    }
}