class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length;
        int[] flat = new int[m*n];
        int index = 0;
        for(int[] arr: grid){
            for(int num: arr){
                if(((num-grid[0][0])%x) != 0) return -1;
                flat[index++] = num;
            }
        }

        Arrays.sort(flat);
        int median = flat[flat.length/2];
        int operations = 0;

        for(int num: flat){
            operations += (Math.abs(num-median)/x);            
        }
        return operations;
    }
}