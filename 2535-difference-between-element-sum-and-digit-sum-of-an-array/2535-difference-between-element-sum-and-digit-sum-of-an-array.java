class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int num:nums){
            sum += num;
            while(num != 0){
                sum -= num%10;
                num /= 10;
            }
        }
        return sum;
    }
}