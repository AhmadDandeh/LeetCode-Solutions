class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;

            int width = right - left + 1;
            int height = bottom - top + 1;
            int totalElements = 2 * (width + height) - 4;

            int[] layerArray = new int[totalElements];
            int idx = 0;

            for (int j = left; j < right; j++) layerArray[idx++] = grid[top][j];          // Top row
            for (int i = top; i < bottom; i++) layerArray[idx++] = grid[i][right];        // Right col
            for (int j = right; j > left; j--) layerArray[idx++] = grid[bottom][j];       // Bottom row
            for (int i = bottom; i > top; i--) layerArray[idx++] = grid[i][left];         // Left col

            int rotation = k % totalElements;
            int currentIdx = rotation;

            for (int j = left; j < right; j++) grid[top][j] = layerArray[currentIdx++ % totalElements];
            for (int i = top; i < bottom; i++) grid[i][right] = layerArray[currentIdx++ % totalElements];
            for (int j = right; j > left; j--) grid[bottom][j] = layerArray[currentIdx++ % totalElements];
            for (int i = bottom; i > top; i--) grid[i][left] = layerArray[currentIdx++ % totalElements];
        }

        return grid;
    }
}