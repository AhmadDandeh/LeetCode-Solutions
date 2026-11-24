class Solution {
    public int maxLength(int[] nums) {
        int pro = 1;
        int maxL = 2;
        int l = 0;
        for(int r=0; r<nums.length; r++){
            while(gcd(pro, nums[r]) != 1){
                pro /= nums[l++];
            }
            pro *= nums[r];
            maxL = Math.max(maxL, r-l+1);
        }
        return maxL;
    }

    private int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}