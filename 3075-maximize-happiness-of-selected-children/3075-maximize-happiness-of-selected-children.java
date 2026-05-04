class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        Arrays.sort(happiness);
        int n = happiness.length-1;
        for(int i = 0; i<k; i++){
            long curr = happiness[n-i]-i;
            if(curr<=0) break;
            ans += curr;
        }
        return ans;
    }
}