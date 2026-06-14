class Solution {
    public int kthFactor(int n, int k) {
        int sqrt = (int) Math.sqrt(n);
        int lim = 0;        
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                k--;
                lim++;
                if (k == 0) {
                    return i;
                }
            }
        }
        
        if (sqrt * sqrt == n) {
            sqrt--;
            lim--;
        }
        if(k>lim) return -1;
        
        for (int i = sqrt; i >= 1; i--) {
            if (n % i == 0) {
                k--;
                if (k == 0) {
                    return n / i;
                }
            }
        }
        return -1;
    }
}