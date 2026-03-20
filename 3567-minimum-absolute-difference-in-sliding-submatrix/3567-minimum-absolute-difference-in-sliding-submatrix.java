class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m-k+1][n-k+1];
        if(k == 1) return ans;
        for(int i =0; i<ans.length; i++){
            for(int j =0; j< ans[0].length; j++){
                ans[i][j] = getSubResutl(grid, i, j, k);
            }
        }
        return ans;
    }

    private int getSubResutl(int[][] grid, int i, int j, int k){
        int[] arr = new int[k*k];
        for(int ii = 0; ii< k; ii++){
            for(int jj = 0; jj< k; jj++){
                arr[ii+jj*k] = grid[ii+i][jj+j];
            }
        }
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        boolean foundDistinct = false;

        for (int ii = 1; ii < arr.length; ii++) {
            int diff = arr[ii] - arr[ii - 1];
            if (diff > 0) {
                minDiff = Math.min(minDiff, diff);
                foundDistinct = true;
            }
        }

        return foundDistinct ? minDiff : 0;
    }
}