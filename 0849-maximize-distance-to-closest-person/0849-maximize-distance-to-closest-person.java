class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length, ans = 0, prev = -1;
        for(int i =0; i<n; i++){
            if(seats[i] == 1){
                if(prev == -1) ans = Math.max(ans, i);
                else ans = Math.max(ans, (i-prev)/2);
                prev = i;
            }
        }
        return Math.max(ans, n-1-prev);
    }
}