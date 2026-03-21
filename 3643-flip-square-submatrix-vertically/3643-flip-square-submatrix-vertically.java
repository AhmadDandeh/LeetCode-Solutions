class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int up = x, down = x+k-1, right = k+y;
        while(down>up){
            for(int i = y; i<right; i++){
                x = grid[up][i];
                grid[up][i] = grid[down][i];
                grid[down][i] = x;
            }
            down--;
            up++;
        }
        return grid;
    }
}