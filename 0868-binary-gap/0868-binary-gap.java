class Solution {
    public int binaryGap(int n) {
        int ans =0;
        int last = -1;
        for(int i=0; i<32; i++){
            if(((n >> i)&1) == 1){
                if(last>=0){
                    ans = Math.max(ans, i-last);
                }
                last = i;
            }
        }
        return ans;
    }
}