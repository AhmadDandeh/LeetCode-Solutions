class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] ans = new int[len];
        if(k == 0){
            return ans;
        }
        else if(k > 0){
            int next = 0;
            for(int i = 1; i<k+1; i++){
                next += code[i];
            }
            ans[0] = next;
            
            for(int i = 1; i<len; i++){
                next += code[(i+k)%len] - code[i];
                ans[i] = next;
            }
        }
        else{
            int prev = 0;
            for(int i = len-1; i>len+k-1; i--){
                prev += code[i];
            }
            ans[0] = prev;
            
            for(int i = 1; i<len; i++){
                prev += code[i-1] - code[(i+k-1+len)%len];
                ans[i] = prev;
            }
        }
        return ans;
    }
}