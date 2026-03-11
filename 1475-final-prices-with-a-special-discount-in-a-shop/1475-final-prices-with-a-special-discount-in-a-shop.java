class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        ArrayDeque<Integer> stack = new ArrayDeque<>(n);
        for(int i = n-1; i>=0; i--){
            int val = prices[i];
            while(!stack.isEmpty() && stack.peekLast()>prices[i]) stack.removeLast();
            if(!stack.isEmpty()) prices[i] -= stack.peekLast();
            stack.addLast(val);
        }
        return prices;
    }
}