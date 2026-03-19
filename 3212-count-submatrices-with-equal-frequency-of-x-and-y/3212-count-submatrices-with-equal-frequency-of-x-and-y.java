class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int ans = 0;
        int m = grid.length, n = grid[0].length;

        boolean[][] gridB = new boolean[m][n];
        int[][] gridI = new int[m][n];

        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                gridI[i][j] = (grid[i][j] == 'X')?1:(grid[i][j] == 'Y')? -1:0;
                gridB[i][j] = (grid[i][j] == 'X');

                if (i > 0){
                    gridI[i][j] += gridI[i - 1][j];
                    gridB[i][j] |= gridB[i - 1][j];
                }
                if (j > 0){
                    gridI[i][j] += gridI[i][j - 1];
                    gridB[i][j] |= gridB[i][j - 1];
                }
                if (i > 0 && j > 0) gridI[i][j] -= gridI[i - 1][j - 1];
                
                if (gridI[i][j] == 0 && gridB[i][j]) ans++;
            }
        }
        return ans;
    }
}