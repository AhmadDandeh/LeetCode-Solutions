class Solution {
    List<List<String>> ans = new ArrayList<>();
    boolean[][] board;
    int n;
    StringBuilder sb = new StringBuilder();

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        board = new boolean[n][n];
        for(int i = 0; i<n; i++){
        	board = new boolean[n][n];
            dfs(0,i);
        }
        return ans;
    }
    
    public void dfs(int i, int j){        
        if(checkRow(i,j) && checkCol(i,j) && checkDia(i,j) && checkRevDia(i,j)){
            board[i][j] = true;
            if(i == n-1){
                List<String> path = new ArrayList<>();
                for(int ii =0; ii<board.length;ii++){
                    sb.setLength(0);
                    for(int jj=0; jj<board.length;jj++){
                        sb.append(board[ii][jj]?'Q':'.');
                    }
                    path.add(sb.toString());
                }
                ans.add(path);
                board[i][j] = false;
                return;
            }
            dfs(i+1,0);
        }
        board[i][j] = false;
        if(j == n-1) return;
        if(i == 0) return;
        dfs(i,j+1);
    }

    public boolean checkRow(int row, int col){
        while(row>0){
            if(board[--row][col]) return false;
        }
        return true;
    }

    public boolean checkCol(int row, int col){
        while(col>0){
            if(board[row][--col]) return false;
        }
        return true;
    }
    
    public boolean checkDia(int row, int col){
        while(row> 0 && col>0){
            if(board[--row][--col]) return false;
        }
        return true;
    }

    public boolean checkRevDia(int row, int col){
        while(row> 0 && col<board.length-1){
            if(board[--row][++col]) return false;
        }
        return true;
    }
}