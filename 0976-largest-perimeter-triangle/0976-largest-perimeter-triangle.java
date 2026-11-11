class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = n-3; i>=0; i--){
            if(nums[i+2] < nums[i+1]+nums[i]) return nums[i+2]+nums[i+1]+nums[i];
        }
        return 0;
    }
}