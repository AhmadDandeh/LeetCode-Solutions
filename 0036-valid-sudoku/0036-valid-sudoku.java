class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer>[] cells = new HashSet[10];
        Set<Integer>[] rows = new HashSet[10];
        Set<Integer>[] cols = new HashSet[10];
        for(int i =0; i<9; i++){
            cells[i] = new HashSet<>();
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for(int i =0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    int value = board[i][j]-'0';
                    int cellIndex = 3*(i/3)+j/3;
                    if((!cells[cellIndex].add(value)) ||
                       (!rows[i].add(value)) ||
                       (!cols[j].add(value))) return false;
                }
            }
        }
        return true;
    }
}