class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        while(c>0 || a>0 || b>0){
            if((c&1) == 0){
                if((a & 1) == 1){
                    count++;
                }
                if((b & 1) == 1){
                    count++;
                }
            }
            else{
                if(((a|b)&1) == 0){
                    count++;
                }
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return count;
    }
}