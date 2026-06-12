class Solution {
    public int countBattleships(char[][] board) {
        int ans = 0, m = board.length, n = board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 'X'){
                    if(i-1>=0 && board[i-1][j] == 'X') continue;
                    if(j-1>=0 && board[i][j-1] == 'X') continue;
                    ans++;
                }
            }
        }
        return ans;
    }
}