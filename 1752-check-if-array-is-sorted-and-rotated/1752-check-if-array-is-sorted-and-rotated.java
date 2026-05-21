class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        boolean flag = nums[0]< nums[n-1]? true:false;
        for(int i=1; i<n; i++){
            if(nums[i]<nums[i-1]){
                if(flag) return false;
                else flag = true;
            }
        }
        return true;
    }
}