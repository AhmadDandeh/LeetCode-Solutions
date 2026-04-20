class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int ans = 0;
        int row = grid.length, col = grid[0].length;
        if(row <3 || col<3) return 0;
        for(int i = 1; i<row-1; i++){
            for(int j = 1; j< col-1; j++){
                if(grid[i][j] == 5){
                    if((grid[i-1][j-1] == 2) && (grid[i+1][j+1] == 8)){
                        if((grid[i-1][j+1] == 4) && (grid[i+1][j-1] == 6)){
                            if(grid[i-1][j] == 9 && grid[i+1][j] == 1 && grid[i][j-1] == 7 && grid[i][j+1] == 3) ans++;
                        }
                        else if((grid[i-1][j+1] == 6) && (grid[i+1][j-1] == 4)){
                            if(grid[i-1][j] == 7 && grid[i+1][j] == 3 && grid[i][j-1] == 9 && grid[i][j+1] == 1) ans++;
                        }
                    }
                    else if((grid[i-1][j-1] == 4) && (grid[i+1][j+1] == 6)){
                        if((grid[i-1][j+1] == 8) && (grid[i+1][j-1] == 2)){
                            if(grid[i-1][j] == 3 && grid[i+1][j] == 7 && grid[i][j-1] == 9 && grid[i][j+1] == 1) ans++;
                        }
                        else if((grid[i-1][j+1] == 2) && (grid[i+1][j-1] == 8)){
                            if(grid[i-1][j] == 9 && grid[i+1][j] == 1 && grid[i][j-1] == 3 && grid[i][j+1] == 7) ans++;
                        }
                    }
                    else if((grid[i-1][j-1] == 6) && (grid[i+1][j+1] == 4)){
                        if((grid[i-1][j+1] == 2) && (grid[i+1][j-1] == 8)){
                            if(grid[i-1][j] == 7 && grid[i+1][j] == 3 && grid[i][j-1] == 1 && grid[i][j+1] == 9) ans++;
                        }
                        else if((grid[i-1][j+1] == 8) && (grid[i+1][j-1] == 2)){
                            if(grid[i-1][j] == 1 && grid[i+1][j] == 9 && grid[i][j-1] == 7 && grid[i][j+1] == 3) ans++;
                        }
                    }
                    else if((grid[i-1][j-1] == 8) && (grid[i+1][j+1] == 2)){
                        if((grid[i-1][j+1] == 6) && (grid[i+1][j-1] == 4)){
                            if(grid[i-1][j] == 1 && grid[i+1][j] == 9 && grid[i][j-1] == 3 && grid[i][j+1] == 7) ans++;
                        }
                        else if((grid[i-1][j+1] == 4) && (grid[i+1][j-1] == 6)){
                            if(grid[i-1][j] == 3 && grid[i+1][j] == 7 && grid[i][j-1] == 1 && grid[i][j+1] == 9) ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}