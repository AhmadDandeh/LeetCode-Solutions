class Solution {
    public int minFlips(int[][] grid) {
        int colChanges = 0, rowChanges = 0;
        // Start with rows
        int m = grid.length;
        int n = grid[0].length;
        int start =0, end = n-1;
        for(int i=0; i<m; i++){
            start = 0; end = n-1;
            while(start<end){
                if(grid[i][start] != grid[i][end]) rowChanges++;
                start++;
                end--;
            }
        }

        // Now Columns
        for(int i=0; i<n; i++){
            start = 0; end = m-1;
            while(start<end){
                if(grid[start][i] != grid[end][i]) colChanges++;
                start++;
                end--;
            }
        }

        return Math.min(colChanges, rowChanges);
    }
}