class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] res = new int[m][n];
        int pro = 1;
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                res[i][j] = pro;
                pro = (pro*(grid[i][j]%12345))%12345;
            }
        }
        pro = 1;
        for(int i=m-1; i>=0; i--){
            for(int j =n-1; j>=0; j--){
                res[i][j] = (pro * res[i][j])%12345;
                pro = (pro*(grid[i][j]%12345))%12345;
            }
        }

        return res;
    }
}