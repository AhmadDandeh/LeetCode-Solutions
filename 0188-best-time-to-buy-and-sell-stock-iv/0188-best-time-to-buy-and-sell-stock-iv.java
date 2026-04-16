class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices.length<2) return 0;

        if(k >= prices.length/2){
            int ans = 0;
            for(int i=1; i<prices.length; i++) if(prices[i]> prices[i-1]) ans += prices[i]-prices[i-1];
            return ans;
        }

        int[] buy = new int[k+1];
        int[] sell = new int[k+1];
        Arrays.fill(buy, Integer.MIN_VALUE);
        for(int p: prices){
            for(int i = 1; i<=k; i++){
                buy[i] = Math.max(buy[i], sell[i-1]-p);
                sell[i] = Math.max(sell[i],buy[i]+p);
            }
        }
        return sell[k];
    }
}