class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] occ = new int[51];
        int n = nums.length-1;
        for(int num:nums) occ[num]++;
        if(k == 1){
            for(int i = 50; i>=0; i--){
                if(occ[i] == 1) return i;
            }
        }
        else if(k == nums.length){
            for(int i = 50; i>=0; i--){
                if(occ[i] != 0) return i;
            }
        }
        else{
            if(occ[nums[0]] == 1){
                if(occ[nums[n]] == 1) return Math.max(nums[0], nums[n]);
                else return nums[0];
            }
            else if(occ[nums[n]] == 1) return nums[n];
        }
        return -1;
    }
}