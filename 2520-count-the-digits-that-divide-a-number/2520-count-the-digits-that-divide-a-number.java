class Solution {
    public int countDigits(int num) {
        int helper = num;
        int ans = 0;
        while(helper>0){
            int d = helper%10;
            if(d != 0 && num%d == 0) ans++;
            helper /= 10;
        }
        return ans;
    }
}