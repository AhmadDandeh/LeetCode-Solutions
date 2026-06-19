class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int len = bookings.length;
        int[] diff = new int[n];
        for(int[] b:bookings){
            diff[b[0]-1] += b[2];
            if(b[1] != n) diff[b[1]] -= b[2];
        }
        
        for(int i=1; i<n; i++){
            diff[i] += diff[i-1];
        }
        return diff;
    }
}