class Solution {
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        for(int i=1; i<n; i++) if(complexity[i] <= complexity[0]) return 0;
        return fac(n-1);
    }

    private int fac(int n){
        long ans = 1;
        while(n>0){
            ans = (ans * n--) % 1000000007;
        }
        return (int) ans;
    }
}