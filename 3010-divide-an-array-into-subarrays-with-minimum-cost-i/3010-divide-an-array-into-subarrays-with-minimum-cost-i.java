class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length, f1 = Math.min(nums[1], nums[2]), f2 = Math.max(nums[1],nums[2]);
        for(int i =3; i<n; i++){
            if(nums[i]<f1){
                f2 = f1;
                f1 = nums[i];
            }
            else{
                if(nums[i]<f2) f2 = nums[i];
            }
        }
        return nums[0]+f1+f2;
    }
}