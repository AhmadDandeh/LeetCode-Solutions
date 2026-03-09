class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i =0; i< nums.length; i++){
            int x = sumOfDigits(nums[i]);
            if(ans > x){
                ans = x;
            }
        }
        return ans;
    }

    public int sumOfDigits(int number){
        int ans = 0;
        while(number>0){
            ans += number%10;
            number = number/10;
        }
        return ans;
    }
}