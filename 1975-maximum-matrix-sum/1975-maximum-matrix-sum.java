class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length, min = Integer.MAX_VALUE, count = 0;
        long ans = 0;
        for(int i =0; i<n; i++){
            for(int j=0; j<n;j++){
                if(matrix[i][j]<0) count++;
                int value = Math.abs(matrix[i][j]);
                min = Math.min(min, value);
                ans += value;
            }
        }
        return ((count&1) == 1)?  ans-2*min: ans;
    }
}