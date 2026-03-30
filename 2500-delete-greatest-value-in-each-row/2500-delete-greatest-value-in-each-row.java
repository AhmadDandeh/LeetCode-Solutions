class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int[] g:grid){
            Arrays.sort(g);
        }

        int ans = 0;
        for(int i = grid[0].length-1; i>-1; i--){
            int max = Integer.MIN_VALUE;
            for(int j =0; j<grid.length; j++){
                max = Math.max(max, grid[j][i]);
            }
            ans += max;
        }
        return ans;
    }
}