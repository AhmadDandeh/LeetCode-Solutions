class Solution {
    boolean[][] visited;
    public int numIslands(char[][] grid) {
        int ans = 0, m = grid.length, n = grid[0].length;
        visited = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    markVisited(grid, i, j, m, n);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void markVisited(char[][] grid, int i, int j, int m, int n){
        visited[i][j] = true;
        if(i-1>=0 && grid[i-1][j] == '1' && !visited[i-1][j]) markVisited(grid, i-1, j, m, n);
        if(i+1<m && grid[i+1][j] == '1' && !visited[i+1][j]) markVisited(grid, i+1, j, m, n);
        if(j-1>=0 && grid[i][j-1] == '1' && !visited[i][j-1]) markVisited(grid, i, j-1, m, n);
        if(j+1<n && grid[i][j+1] == '1' && !visited[i][j+1]) markVisited(grid, i, j+1, m, n);
    }
}