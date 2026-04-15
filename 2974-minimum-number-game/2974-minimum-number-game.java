class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i += 2){
            ans[i+1] = nums[i];
            ans[i] = nums[i+1];
        }
        return ans;
    }
}