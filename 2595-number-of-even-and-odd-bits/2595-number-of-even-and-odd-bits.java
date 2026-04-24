class Solution {
    public int[] evenOddBit(int n) {
        boolean type = true; // true mean even, false means odd
        int[] ans = new int[2];
        ans[0] =0;
        ans[1] =0;

        while(n!=0){
            if((n&1) == 1){
                if(type){ // even
                    ans[0]++;
                }
                else{ // odd
                    ans[1]++;
                }
            }
            n >>= 1;
            type = !type;
        }
        return ans;
    }
}