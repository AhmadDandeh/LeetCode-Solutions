class Solution {
    public int majorityElement(int[] nums) {
        int max = 0, count = 0;
        for(int num:nums){
            if(count == 0){
                count++;
                max = num;
            }
            else if(max == num) count++;
            else count--;
        }
        return max;
    }
}