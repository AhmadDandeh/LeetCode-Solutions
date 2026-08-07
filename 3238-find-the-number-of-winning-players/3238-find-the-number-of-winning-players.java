class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] hash = new int[n][11];
        for(int i=0; i<pick.length; i++){
            hash[pick[i][0]][pick[i][1]]++;
        }
        int ans = 0;
        for(int i =0; i<hash.length; i++){
            for(int j=0; j<hash[0].length; j++){
                if(hash[i][j]>i){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}