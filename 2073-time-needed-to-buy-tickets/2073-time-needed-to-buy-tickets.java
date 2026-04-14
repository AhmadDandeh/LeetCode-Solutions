class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0;
        int n = tickets.length;
        int target = tickets[k];
        for(int i =0; i<=k; i++) ans += Math.min(tickets[i], target);
        target--;
        for(int i =k+1; i<n; i++) ans += Math.min(tickets[i], target);
        return ans;
    }
}