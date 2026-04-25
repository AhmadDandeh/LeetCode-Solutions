class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int ans = logs[0][0];
        int max = logs[0][1];
        for(int i =1; i<logs.length; i++){
            int diff = logs[i][1]-logs[i-1][1];
            if(diff > max){
                max = diff;
                ans = logs[i][0];
            }
            else if(diff == max) ans = Math.min(ans, logs[i][0]);
        }
        return ans;
    }
}