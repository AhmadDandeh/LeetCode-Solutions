class Solution {
    public int buyChoco(int[] prices, int money) {
        int s1 = prices[0], s2 = Integer.MAX_VALUE;
        for(int i =1; i<prices.length; i++){
            if(prices[i]<s1){
                s2 = s1;
                s1 = prices[i];
            }
            else if(prices[i]<s2) s2 = prices[i];
        }

        int remain = money - s1 -s2;
        return  remain < 0? money:remain;
    }
}