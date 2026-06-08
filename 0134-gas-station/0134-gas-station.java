class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length, totalDiff = 0, cand = 0, sum = 0;
        for(int i=0; i<n; i++){
            int d = gas[i]-cost[i];
            totalDiff += d;
            sum += d;
            if(sum<0){
                cand = i+1;
                sum = 0;
            }
        }
        return totalDiff<0? -1: cand;
    }
}