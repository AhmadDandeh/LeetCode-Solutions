class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        TreeSet<Integer> distinctSums = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                distinctSums.add(grid[i][j]);
                
                for (int k = 1; isValid(m, n, i, j, k); k++) {
                    distinctSums.add(calculateRhombusSum(grid, i, j, k));
                }
                
                while (distinctSums.size() > 3) {
                    distinctSums.pollLast();
                }
            }
        }

        int[] result = new int[distinctSums.size()];
        int index = 0;
        for (int sum : distinctSums) {
            result[index++] = sum;
        }
        return result;
    }

    private boolean isValid(int m, int n, int i, int j, int k) {
        return (i - k >= 0) && (i + k < m) && (j - k >= 0) && (j + k < n);
    }

    private int calculateRhombusSum(int[][] grid, int r, int c, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += grid[r - k + i][c + i]; // Top to Right
            sum += grid[r + i][c + k - i]; // Right to Bottom
            sum += grid[r + k - i][c - i]; // Bottom to Left
            sum += grid[r - i][c - k + i]; // Left to Top
        }
        return sum;
    }
}