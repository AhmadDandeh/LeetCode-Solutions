class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] duration = new int[n+1];
        duration[0] = startTime[0]-0;
        duration[n] = eventTime - endTime[n-1];
        for(int i =1; i<n; i++){
            duration[i] = startTime[i] - endTime[i-1];
        }

        int windowSize = k+1;
        int sum = 0;
        for(int i =0; i<windowSize; i++){
            sum += duration[i];
        }
        int max = sum;
        for(int i =windowSize; i<=n; i++){
            sum += duration[i] - duration[i-windowSize];
            max = Math.max(max, sum);
        }
        return max;
    }
}