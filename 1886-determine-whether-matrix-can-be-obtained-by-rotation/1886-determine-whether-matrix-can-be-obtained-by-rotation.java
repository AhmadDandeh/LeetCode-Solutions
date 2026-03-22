class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean b0 = true, b1 = true, b2 =true, b3 = true;
        int n = mat.length;
        for(int i =0; i<n; i++){
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) b0 = false;
            
                if (mat[n - 1 - j][i] != target[i][j]) b1 = false;
            
                if (mat[n - 1 - i][n - 1 - j] != target[i][j]) b2 = false;
            
                if (mat[j][n - 1 - i] != target[i][j]) b3 = false;
            }
            if (!b0 && !b1 && !b2 && !b3) return false;
        }
        return true;
    }
}