class Solution {
    public int pivotInteger(int n) {
        int[] prefix = new int[n+1];
        prefix[0] = 0;
        for(int i =1; i<=n; i++){
            prefix[i] = i + prefix[i-1];
        }

        for(int i = n/2+1; i<=n; i++){
            if(prefix[i] == (prefix[n] - prefix[i-1])){
                return i;
            }
        }
        return -1;
    }
}