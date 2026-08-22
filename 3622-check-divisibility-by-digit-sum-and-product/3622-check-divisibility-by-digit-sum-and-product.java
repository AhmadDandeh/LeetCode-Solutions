class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, pro = 1, h = n;
        while(h!=0){
            int x = h%10;
            h=h/10;
            sum += x;
            pro *= x;
        }
        return (n % (sum+pro)) == 0;
    }
}