class Solution {
    /*
    // Normal Recursion
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n<3) return 1;
        return tribonacci(n-1) +tribonacci(n-2) + tribonacci(n-3);
    }
    */
    /*
    // Memo
    int[] memo;
    public int tribonacci(int n) {
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        return rec(n);
        
    }

    public int rec(int n){
        if(n == 0) return 0;
        if(n<3) return 1;
        if(memo[n] == -1) memo[n] = rec(n-1) + rec(n-2) + rec(n-3);
        return memo[n];
    }
    */
    
    // Tabulation
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n<3) return 1;
        int x1 = 0;
        int x2 = 1;
        int x3 = 1;
        for(int i =3; i<=n; i++){
            int sum = x1 + x2 + x3;
            x1 = x2;
            x2 = x3;
            x3 = sum;
        }
        return x3;
    }
}