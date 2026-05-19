class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = -1;
        int d = Integer.MAX_VALUE;
        for(int i =0; i< points.length; i++){
            if(x == points[i][0]){
                int d1 = Math.abs(y-points[i][1]);
                if(d1<d){
                    ans = i;
                    d = d1;
                }
            }
            else if( y == points[i][1]){
                int d1 = Math.abs(x-points[i][0]);
                if(d1<d){
                    ans = i;
                    d = d1;
                }
            }
        }
        return ans;
    }
}