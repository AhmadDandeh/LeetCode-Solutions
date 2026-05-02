class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if(m*n != r*c) return mat;
        int[][] ans = new int[r][c];
        int pos = 0;
        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[pos/c][pos%c] = mat[i][j];
                pos++;
            }
        }
        return ans;
    }
}