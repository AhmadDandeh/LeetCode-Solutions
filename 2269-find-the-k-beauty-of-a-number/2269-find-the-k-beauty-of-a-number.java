class Solution {
    public int divisorSubstrings(int num, int k) {
        int n =num;
        int mod = (int) Math.pow(10,k);
        int count = 0;

        while (n>= mod/10){
            int x = n % mod;
            if(x!=0 && num%x == 0) count++;
            n /= 10;
        }
        return count;
    }
}