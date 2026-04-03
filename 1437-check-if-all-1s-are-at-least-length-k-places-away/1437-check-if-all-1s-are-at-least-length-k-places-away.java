class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        if(k == 0){
            return true;
        }

        int prevIndex = -1;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
                if(i-prevIndex > k || prevIndex == -1){
                    prevIndex = i;
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }
}