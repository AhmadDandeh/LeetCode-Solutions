class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length, size = n*m, num =0;
        k = k % size;
        k = (size-k)%size;
        int r = k / n, c = k % n;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        while(num<size){
            if(c == n){
                r++;
                c = 0;
                if(r == m) r = 0;
            }
            sub.add(grid[r][c]);
            c++;
            num++;
            if(sub.size() == n){
                ans.add(sub);
                sub = new ArrayList<>();
            }
        }
        return ans;
    }

}