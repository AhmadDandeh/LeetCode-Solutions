class Solution {
    public int integerBreak(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;
        if(n == 4) return 4;
        int pro = 1;
        if(n%3 ==1){
            pro = 4;
            n -= 4;
        }
        else if(n%3 ==2){
            pro = 2;
            n -= 2;
        }
        int div = n/3;
        return pro * ((int) Math.pow(3, div));
    }
}