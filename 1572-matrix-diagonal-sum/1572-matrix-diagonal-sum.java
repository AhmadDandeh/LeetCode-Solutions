class Solution {
    public int diagonalSum(int[][] mat) {
        int ans =0, n = mat.length-1;
        for(int i=0; i<=n; i++){
            ans += mat[i][i]+mat[i][n-i];
        }
        if((n&1) == 0) ans -= mat[n/2][n/2];
        return ans;
    }
}