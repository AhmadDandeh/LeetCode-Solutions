class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int ans = 1;
        int max = Math.min(rectangles[0][0], rectangles[0][1]);
        for(int i =1; i<rectangles.length; i++){
            int recM = Math.min(rectangles[i][0], rectangles[i][1]);
            if(recM == max) ans++;
            else if(recM > max){
                max = recM;
                ans = 1;
            }
        }
        return ans;
    }
}