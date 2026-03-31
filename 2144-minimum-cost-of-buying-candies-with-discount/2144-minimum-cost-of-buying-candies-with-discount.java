class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length, remain = n%3, ans = 0;
        for(int i =0; i< remain; i++) ans += cost[i];
        for(int i =remain; i< n; i++){
            ans += cost[++i];
            ans += cost[++i];
        }
        return ans;
    }
}