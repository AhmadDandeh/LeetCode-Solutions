class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        if(n == 1) return grid[0][0];
        int prevMin1 = 0, firI = -1, prevIndex1 = -1, prevMin2 = 0;
        for(int i =0; i<n; i++){
            int currMin1 = Integer.MAX_VALUE, currMin2 = Integer.MAX_VALUE, currIndex1 = -1;
            for(int j = 0; j<n; j++){
                if(j == prevIndex1) grid[i][j] += prevMin2;
                else grid[i][j] += prevMin1;

                if(grid[i][j] < currMin1){
                    currMin2 = currMin1;
                    currMin1 = grid[i][j];
                    currIndex1 = j;
                }
                else if(grid[i][j] < currMin2){
                    currMin2 = grid[i][j];
                }
            }
            prevMin1 = currMin1;
            prevMin2 = currMin2;
            prevIndex1 = currIndex1;
        }
        return prevMin1;
    }
}