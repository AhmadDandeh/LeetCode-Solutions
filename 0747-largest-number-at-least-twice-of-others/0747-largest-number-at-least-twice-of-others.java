class Solution {
    public int dominantIndex(int[] nums) {
        int first, second, n = nums.length;
        if(nums[0]<nums[1]){first = 1; second = 0;}
        else {first = 0; second = 1;}

        for(int i = 2; i<n; i++){
            if(nums[i]>nums[first]){
                second = first;
                first = i;
            }
            else if(nums[i]>nums[second]) second = i;
        }
        return nums[first]>=nums[second]*2? first: -1;
    }
}