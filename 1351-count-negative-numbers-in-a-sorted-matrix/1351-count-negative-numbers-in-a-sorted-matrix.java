class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int right = n;
        for(int i = 0; i<m; i++){
            right = binarySearch(grid[i], right);
            ans += n-right;
        }
        return ans;
    }

    private int binarySearch(int[] arr, int end){
        int lo = 0;
        int hi = end;

        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]<0) hi = mid;
            else lo = mid+1;
        }
        return lo;
    }
}