class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        int mid = (intLength+1)/2;
        int n = queries.length;
        long[] ans = new long[n];

        long start = (long) Math.pow(10,mid-1);
        long end = start*10 -1;
        boolean isOdd = (intLength & 1) == 1;
        for(int i =0; i<n; i++){
            long left = start + (queries[i]-1);
            if(left>end){
                ans[i] = -1;
                continue;
            }
            long base = left;
            if(isOdd){
                base /= 10;
            }
            
            while(base>0){
                left = left*10 + base%10;
                base /=10;
            }
            ans[i] = left;
        }

        return ans;
    }
}