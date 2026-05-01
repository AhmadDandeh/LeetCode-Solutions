class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] rowsDiff = new int[m];
        int[] colsDiff = new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    rowsDiff[i]++;
                    colsDiff[j]++;
                }
                else{
                    rowsDiff[i]--;
                    colsDiff[j]--;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = rowsDiff[i]+colsDiff[j];
            }
        }
        return grid;
    }
}