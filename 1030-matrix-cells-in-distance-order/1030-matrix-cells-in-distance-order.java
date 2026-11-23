class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter){
        int[][] ans = new int[rows * cols][2];
        int index = 0;
        boolean[][] visited = new boolean[rows][cols];
        int[][] directions = new int[][]{{-1,0}, {1,0}, {0,-1}, {0,1}};
        Deque<int[]> dq = new ArrayDeque<>();
        dq.addLast(new int[]{rCenter, cCenter});
        visited[rCenter][cCenter] = true;
        while(!dq.isEmpty()){
            int[] cell = dq.removeFirst();
            ans[index++] = cell;
            for(int[] d:directions){
                int r = cell[0] + d[0];
                int c = cell[1] + d[1];
                if(r>=0 && r<rows && c>=0 && c<cols && !visited[r][c]){ 
                    dq.addLast(new int[]{r, c});
                    visited[r][c] = true;
                }
            }
        }
        return ans;
    }
}