class Solution {
    public int surfaceArea(int[][] grid) {
        int ans = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 0) continue;
                int x = grid[i][j] * 4 + 2;
                if(i>0) x -= 2*Math.min(grid[i][j], grid[i-1][j]);
                if(j>0) x -= 2*Math.min(grid[i][j], grid[i][j-1]);
                ans += x;
            }
        }
        return ans;
    }
}