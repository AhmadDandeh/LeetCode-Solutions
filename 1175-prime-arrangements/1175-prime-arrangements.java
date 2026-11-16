class Solution {
    public int numPrimeArrangements(int n) {
        boolean[] arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) continue;
            for (int j = i * i; j <= n; j += i) {
                arr[j] = true;
            }
        }
        int c1 = 0, c2 = 0;
        for(int i = 1; i<=n; i++){
            if(arr[i]) c1++;
            else c2++;
        }
        long ans = 1;
        while(c1>1) ans = (ans*c1--)%1000000007;
        while(c2>1) ans = (ans*c2--)%1000000007;
        return (int) ans;
    }
}