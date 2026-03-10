class Solution {
    public int minMaxGame(int[] nums) {
        int range = nums.length;
        while(range>1){
            range /= 2;
            for(int i = 0; i<range; i++){
                if((i&1) == 0) nums[i] = Math.min(nums[2*i], nums[2*i+1]);
                else nums[i] = Math.max(nums[2*i], nums[2*i+1]);
            }
        }
        return nums[0];
    }
}