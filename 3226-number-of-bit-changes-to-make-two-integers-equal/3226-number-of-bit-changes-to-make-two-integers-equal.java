class Solution {
    public int minChanges(int n, int k) {
        int ans =0;
        while(n>0){
            if(((n & 1) == 1) &&((k & 1) == 0)){
                ans++;
            }
            else if(((n & 1) == 0) &&((k & 1) == 1)){
                return -1;
            }
            n /= 2;
            k /= 2;
        }

        if(k>0){
            return -1;
        }
        return ans;
    }
}