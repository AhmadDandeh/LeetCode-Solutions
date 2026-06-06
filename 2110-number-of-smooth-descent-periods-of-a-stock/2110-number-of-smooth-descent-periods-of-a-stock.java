class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 1, len = 1;
        int n = prices.length;
        for(int i = 1; i<n; i++){
            if(prices[i] == prices[i-1]-1) len++;
            else len = 1;
            ans += len;
        }
        return ans;
    }
}