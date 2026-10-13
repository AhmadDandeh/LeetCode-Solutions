class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length, plus = (n+1)/2;
        Arrays.sort(nums);
        int l = 0, r = n - 1;
        long ans = 0;
        while(plus > 0){
            if(Math.abs(nums[l]) >= Math.abs(nums[r])){
                ans += (nums[l] * nums[l]);
                l++;
            }
            else{
                ans += (nums[r] * nums[r]);
                r--;
            }
            plus--;
        }
        while(l<=r){
            ans -= (nums[l] * nums[l]);
            l++;
        }
        return ans;
    }
}