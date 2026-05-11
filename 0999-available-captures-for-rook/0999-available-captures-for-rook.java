class Solution {
    public int numRookCaptures(char[][] board) {
        int rI, rJ;
        int ans = 0;
        // find position of R
        for(int i =0; i< 8; i++){
            for(int j=0; j< 8; j++){
                if(board[i][j] == 'R'){
                    // Up
                    int h = j-1;
                    while(h>-1){
                        if(board[i][h] == 'B'){
                            break;
                        }
                        if(board[i][h] == 'p'){
                            ans++;
                            break;
                        }
                        h--;
                    }
                    // Down
                    h = j+1;
                    while(h<8){
                        if(board[i][h] == 'B'){
                            break;
                        }
                        if(board[i][h] == 'p'){
                            ans++;
                            break;
                        }
                        h++;
                    }
                    // Left
                    h = i-1;
                    while(h>-1){
                        if(board[h][j] == 'B'){
                            break;
                        }
                        if(board[h][j] == 'p'){
                            ans++;
                            break;
                        }
                        h--;
                    }
                    // Right
                    h = i+1;
                    while(h<8){
                        if(board[h][j] == 'B'){
                            break;
                        }
                        if(board[h][j] == 'p'){
                            ans++;
                            break;
                        }
                        h++;
                    }
                    return ans;
                }
            }
        }

        return ans;
    }
}