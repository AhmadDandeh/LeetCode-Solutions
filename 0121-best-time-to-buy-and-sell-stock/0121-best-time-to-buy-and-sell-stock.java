class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, n = prices.length, max = prices[n-1];
        for(int i= n-2; i>=0; i--){
            if(prices[i]<max) profit = Math.max(profit, max - prices[i]);
            else max = prices[i];
        }
        return profit;
    }
}