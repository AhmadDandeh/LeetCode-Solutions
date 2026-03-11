class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int ans = events[0][0];
        int minTime = events[0][1];
        for(int i=1;i<events.length;i++){
            int time = events[i][1]-events[i-1][1];
            if(time > minTime){
                ans = events[i][0];
                minTime = time;
            }
            else if(time == minTime && events[i][0]<ans){
                ans = events[i][0];
            }
        }

        return ans;
    }
}