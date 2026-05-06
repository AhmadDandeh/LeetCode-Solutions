class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n<3) return true;
        boolean prev = (n&1) == 0;
        n /=2;
        while(n>0){
            if(prev){
                if((n&1) == 0) return false;
                prev = false;
            }
            else{
                if((n&1) == 1) return false;
                prev = true;
            }
            n/=2;
        }
        return true;
    }
}