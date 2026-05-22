class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = Integer.MIN_VALUE;
        for(int c: costs) max = Math.max(max, c);
        int[] sortedCosts = new int[max+1];
        for(int c: costs) if(c <= coins) sortedCosts[c]++;

        int ans = 0;
        for(int i = 1; i< sortedCosts.length && coins > 0; i++){
            if(sortedCosts[i] == 0) continue;
            if(i > coins) break;

            int take = Math.min(sortedCosts[i], coins/i);
            coins -= take * i;
            ans += take;
        }
        return ans;
    }
}