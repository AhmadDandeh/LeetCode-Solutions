class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration == 0) return 0;
        int interval = timeSeries[0], ans = 0;
        for(int t: timeSeries){
            ans += Math.min(duration, t + duration - interval);
            interval = t + duration;
        }
        return ans;
    }
}