class Solution {
    public int commonFactors(int a, int b) {
        int gcdVal = gcd(a,b);
        int limit = (int) Math.sqrt(gcdVal);
        int ans = 0;
        for(int i =1; i<=limit; i++){
            if (gcdVal % i == 0) {
                ans++;
                int counterpart = gcdVal / i;
                if (counterpart != i) {
                    ans++;
                }
            }
        }
        
        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}