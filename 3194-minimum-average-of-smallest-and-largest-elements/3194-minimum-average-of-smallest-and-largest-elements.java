class Solution {
    public double minimumAverage(int[] nums) {
        double ans = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n/2; i++){
            double s = ((double) nums[i] + nums[n-i-1])/2;
            if(s < ans) ans = s;
        }
        return ans;
    }
}