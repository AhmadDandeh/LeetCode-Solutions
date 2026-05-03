class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0], min = nums[0];
        for(int num:nums){
            max = max<num? num:max;
            min = min>num? num:min;
        }

        while(min !=0){
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
}