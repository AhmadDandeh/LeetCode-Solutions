class Solution {
    // Tabulation
    public int fib(int n) {
        if(n == 0) return 0;
        int x1 = 0, x2 = 1;
        for(int i=2; i<=n; i++){
            int sum = x1 +x2;
            x1 = x2;
            x2 = sum;
        }
        return x2;
    }
}