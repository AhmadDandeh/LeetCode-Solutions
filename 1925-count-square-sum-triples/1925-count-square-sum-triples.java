class Solution {
    public int countTriples(int n) {
        int ans = 0;
        int upper = (int) Math.sqrt(n-1);
        for(int u = 2; u<= upper; u++){
            for(int v = 1; v<u; v++){
                if (((u - v) & 1) == 0) continue; 
                if(gcd(u, v) != 1) continue;
                int c = u*u + v*v;
                if (c > n) break;
                int help = c;
                while(c<=n){
                    ans += 2;
                    c += help;
                }
            }
        }
        return ans;
    }

    private int gcd(int a, int b){
        while(b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}