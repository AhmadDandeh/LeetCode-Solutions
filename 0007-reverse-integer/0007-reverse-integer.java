class Solution {
    public int reverse(int x) {
        if(x>-10 && x<10) return x;

        int reverse = 0;
        int compareP = 214748364;
        int compareN = -214748364;
        while(x != 0){
            int digit = x%10;
            if((reverse>compareP) ||(reverse == compareP && digit>7)) return 0;
            if((reverse<compareN) ||(reverse == compareN && digit<-8)) return 0;
            
            x /= 10;
            reverse = reverse*10 + digit;
        }
        return reverse;
    }
}