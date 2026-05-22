class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int maxH = 1;
        int seq = 1;
        for(int i =1; i<hBars.length; i++){
            if(hBars[i] == hBars[i-1]+1){
                seq++;
            }
            else{
                maxH = Math.max(maxH, seq);
                seq = 1;
            }
        }
        maxH = Math.max(maxH, seq);
        int maxV = 1;
        seq = 1;
        for(int i =1; i<vBars.length; i++){
            if(vBars[i] == vBars[i-1]+1){
                seq++;
            }
            else{
                maxV = Math.max(maxV, seq);
                seq = 1;
            }
        }
        maxV = Math.max(maxV, seq);
        int len = Math.min(maxV, maxH) + 1;
        return len * len;
    }
}