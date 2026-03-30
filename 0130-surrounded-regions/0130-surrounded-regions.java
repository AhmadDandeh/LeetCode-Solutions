class Solution {
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        if(m<3 || n<3) return;
        for(int i =0; i<n; i++){
            if(board[0][i] == 'O') DFS(board, m, n, 0, i);
        }
        for(int i =0; i<n; i++){
            if(board[m-1][i] == 'O') DFS(board, m, n, m-1, i);
        }
        for(int i =1; i<m-1; i++){
            if(board[i][0] == 'O') DFS(board, m, n, i, 0);
        }
        for(int i =1; i<m-1; i++){
            if(board[i][n-1] == 'O') DFS(board, m, n, i, n-1);
        }
        
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if(board[i][j] == 'S') board[i][j] = 'O';
            }
        }
    }

    private void DFS(char[][] board,int m,int n,int row,int col){
        board[row][col] = 'S';
        if(row-1>=0 && board[row-1][col] == 'O') DFS(board, m, n, row-1, col);
        if(row+1<m && board[row+1][col] == 'O') DFS(board, m, n, row+1, col);
        if(col-1>=0 && board[row][col-1] == 'O') DFS(board, m, n, row, col-1);
        if(col+1<n && board[row][col+1] == 'O') DFS(board, m, n, row, col+1);
    }
}