class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count = 0;
        for(int num: nums){
            if((num & 1) == 0){
                count++;
            }
            if(count == 2){
                return true;
            }
        }
        return false;
    }
}