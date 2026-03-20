class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m-k+1][n-k+1];
        if(k == 1) return ans;
        for(int i =0; i<ans.length; i++){
            for(int j =0; j< ans[0].length; j++){
                ans[i][j] = getSubResult(grid, i, j, k);
            }
        }
        return ans;
    }

    private int getSubResult(int[][] grid, int r, int c, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                set.add(grid[r + i][c + j]);
            }
        }

        if (set.size() < 2) return 0;

        int minDiff = Integer.MAX_VALUE;
        Integer prev = null;

        for (int current : set) {
            if (prev != null) {
                int diff = current - prev;
                if (diff == 1) return 1;
                minDiff = Math.min(minDiff, diff);
            }
            prev = current;
        }

        return minDiff;
    }
}