class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, ans = n+1, l = -1, sum = 0;
        for(int r = 0; r<n; r++){
            sum += nums[r];
            while(sum>=target){
                ans = Math.min(ans, r-l);
                if(ans == 1) return 1;
                sum -= nums[++l];
            }
        }
        return ans == n + 1? 0:ans;
    }
}