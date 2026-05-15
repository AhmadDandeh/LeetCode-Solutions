class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0, zeros = 0;
        for(int num: nums){
            if(num == 0) zeros++;
            else{
                ans += (zeros*(zeros+1)/2);
                zeros = 0;
            }
        }
        ans += (zeros*(zeros+1)/2);
        return ans;
    }
}