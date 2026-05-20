class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int start = 0;
        for(int i= 1; i<nums.length; i++){
            if(nums[i] - nums[start] >k){
                start = i;
                ans++;
            }
        }
        return ++ans;
    }
}