class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int[] minRow = new int[m];
        int[] maxCol = new int[n];
        Arrays.fill(minRow, Integer.MAX_VALUE);
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                minRow[i] = Math.min(minRow[i], matrix[i][j]);
                maxCol[j] = Math.max(maxCol[j], matrix[i][j]);
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == maxCol[j] && matrix[i][j] == minRow[i]){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}