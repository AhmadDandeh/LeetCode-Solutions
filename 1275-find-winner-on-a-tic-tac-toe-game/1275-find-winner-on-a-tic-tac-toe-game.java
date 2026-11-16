class Solution {
    char[][] mat;
    public String tictactoe(int[][] moves) {
        mat = new char[3][3];
        boolean x = true;
        for(int[] a: moves){
            if(x) mat[a[0]][a[1]] = 'X';
            else mat[a[0]][a[1]] = 'O';
            x = !x;
        }
        if(win('X')) return "A";
        else if(win('O')) return "B";
        else return moves.length == 9? "Draw":"Pending";
    }

    private boolean win(char c){
        return (mat[0][0] == c && mat[0][1] == c && mat[0][2] == c)
            || (mat[1][0] == c && mat[1][1] == c && mat[1][2] == c)
            || (mat[2][0] == c && mat[2][1] == c && mat[2][2] == c)
            || (mat[0][0] == c && mat[1][0] == c && mat[2][0] == c)
            || (mat[0][1] == c && mat[1][1] == c && mat[2][1] == c)
            || (mat[0][2] == c && mat[1][2] == c && mat[2][2] == c)
            || (mat[0][0] == c && mat[1][1] == c && mat[2][2] == c)
            || (mat[0][2] == c && mat[1][1] == c && mat[2][0] == c); 
    }
}