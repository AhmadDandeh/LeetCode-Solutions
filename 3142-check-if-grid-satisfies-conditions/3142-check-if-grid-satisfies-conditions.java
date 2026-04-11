class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        for(int i =1; i<grid.length; i++){
            if(grid[i-1][0]!= grid[i][0]) return false;
        }
        for(int j = 1; j< grid[0].length; j++){
            if(grid[0][j-1] == grid[0][j]) return false;
            for(int i =1; i<grid.length; i++){
                if(grid[i-1][j]!= grid[i][j]) return false;
            }
        }
        return true;
    }
}