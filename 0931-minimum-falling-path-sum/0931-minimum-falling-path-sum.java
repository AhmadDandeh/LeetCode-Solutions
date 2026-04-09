class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if(n == 1){
            for(int i =1; i<m; i++){
                matrix[i][0] += matrix[i-1][0];
            }
            return matrix[m-1][0];
        }

        for(int i =1; i<m; i++){
            matrix[i][0] += Math.min(matrix[i-1][0], matrix[i-1][1]);
            matrix[i][n-1] += Math.min(matrix[i-1][n-2], matrix[i-1][n-1]);
            for(int j =1; j<n-1; j++){
                matrix[i][j] += Math.min(matrix[i-1][j-1], Math.min(matrix[i-1][j], matrix[i-1][j+1]));
            }
        }
        int min = matrix[m-1][0];
        for(int j =1; j<n; j++){
            min = Math.min(min, matrix[m-1][j]);
        }
        return min;
    }
}