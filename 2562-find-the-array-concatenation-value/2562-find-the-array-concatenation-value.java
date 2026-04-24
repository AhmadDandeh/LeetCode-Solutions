class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0, leftNumber;
        int left = 0, right = nums.length-1, rightNumber;
        while(left<right){
            leftNumber = nums[left];
            rightNumber = nums[right];
            do{
                leftNumber *= 10;
                rightNumber /= 10;
            }while(rightNumber>0);
            ans += leftNumber + nums[right];
            left++;
            right--;
        }
        if(left == right) ans += nums[right];
        return ans;
    }
}