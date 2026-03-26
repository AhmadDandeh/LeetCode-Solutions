class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long totalSum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) totalSum += grid[i][j];
        }

        // 1. Try Horizontal Cuts
        if (checkHorizontal(grid, m, n, totalSum)) return true;

        // 2. Try Vertical Cuts
        if (checkVertical(grid, m, n, totalSum)) return true;

        return false;
    }

    private boolean checkHorizontal(int[][] grid, int m, int n, long totalSum) {
        Map<Integer, Integer> mapUp = new HashMap<>();
        Map<Integer, Integer> mapDown = new HashMap<>();
        long upSum = 0;

        // Initialize mapDown with all elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mapDown.put(grid[i][j], mapDown.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        for (int i = 0; i < m - 1; i++) { // Cut after row i
            // Move row i from mapDown to mapUp
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                upSum += val;
                mapUp.put(val, mapUp.getOrDefault(val, 0) + 1);
                mapDown.put(val, mapDown.get(val) - 1);
                if (mapDown.get(val) == 0) mapDown.remove(val);
            }

            long downSum = totalSum - upSum;
            // Check if equal or can be made equal
            if (isEqualPossible(upSum, downSum, mapUp, mapDown, i + 1, n, m - (i + 1), n, grid, i, true)) return true;
        }
        return false;
    }

    private boolean checkVertical(int[][] grid, int m, int n, long totalSum) {
        Map<Integer, Integer> mapLeft = new HashMap<>();
        Map<Integer, Integer> mapRight = new HashMap<>();
        long leftSum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mapRight.put(grid[i][j], mapRight.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        for (int j = 0; j < n - 1; j++) { // Cut after column j
            for (int i = 0; i < m; i++) {
                int val = grid[i][j];
                leftSum += val;
                mapLeft.put(val, mapLeft.getOrDefault(val, 0) + 1);
                mapRight.put(val, mapRight.get(val) - 1);
                if (mapRight.get(val) == 0) mapRight.remove(val);
            }

            long rightSum = totalSum - leftSum;
            if (isEqualPossible(leftSum, rightSum, mapLeft, mapRight, m, j + 1, m, n - (j + 1), grid, j, false)) return true;
        }
        return false;
    }

    private boolean isEqualPossible(long s1, long s2, Map<Integer, Integer> m1, Map<Integer, Integer> m2, 
                                     int h1, int w1, int h2, int w2, int[][] grid, int cutIdx, boolean isHorizontal) {
        if (s1 == s2) return true;
        long diff = s1 - s2;

        // Try to remove from section 1
        if (diff > 0 && diff <= 200000) {
            int target = (int) diff;
            if (m1.containsKey(target) && isConnectedAfterRemoval(target, h1, w1, grid, cutIdx, isHorizontal, true)) return true;
        } 
        // Try to remove from section 2
        else if (diff < 0 && Math.abs(diff) <= 200000) {
            int target = (int) Math.abs(diff);
            if (m2.containsKey(target) && isConnectedAfterRemoval(target, h2, w2, grid, cutIdx, isHorizontal, false)) return true;
        }
        return false;
    }

    private boolean isConnectedAfterRemoval(int target, int h, int w, int[][] grid, int cutIdx, boolean isHorizontal, boolean isFirstPart) {
        // If the section is a block (height > 1 AND width > 1), any cell removal keeps it connected.
        if (h > 1 && w > 1) return true;

        // If it's a row (height = 1), only the leftmost or rightmost can be removed
        if (h == 1) {
            int row = isHorizontal ? (isFirstPart ? 0 : grid.length - 1) : 0;
            int startCol = isHorizontal ? 0 : (isFirstPart ? 0 : cutIdx + 1);
            int endCol = isHorizontal ? grid[0].length - 1 : (isFirstPart ? cutIdx : grid[0].length - 1);
            return (target == grid[row][startCol] || target == grid[row][endCol]);
        }

        // If it's a column (width = 1), only the topmost or bottommost can be removed
        if (w == 1) {
            int col = !isHorizontal ? (isFirstPart ? 0 : grid[0].length - 1) : 0;
            int startRow = !isHorizontal ? 0 : (isFirstPart ? 0 : cutIdx + 1);
            int endRow = !isHorizontal ? grid.length - 1 : (isFirstPart ? cutIdx : grid.length - 1);
            return (target == grid[startRow][col] || target == grid[endRow][col]);
        }
        return true;
    }
}