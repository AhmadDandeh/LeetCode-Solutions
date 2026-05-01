class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum =0, prev = 0, n = nums.length;
        for(int i=0; i<n; i++){
            sum += nums[i];
            prev += nums[i]*i;
        }
        int max = prev;
        for(int i=n-1; i>0; i--){
            prev = prev + sum - nums[i] * n;
            max = Math.max(max, prev);
        }
        return max;
    }
}