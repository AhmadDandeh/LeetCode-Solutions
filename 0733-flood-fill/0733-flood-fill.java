class Solution {
    record Point(int x, int y){}
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        
        if (originalColor == color) {
            return image;
        }

        int m = image.length;
        int n = image[0].length;
        
        ArrayDeque<Point> queue = new ArrayDeque<>();
        queue.addLast(new Point(sr, sc));
        image[sr][sc] = color;

        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Point curr = queue.removeFirst();

            for (int i = 0; i < 4; i++) {
                int nextRow = curr.x + dRow[i];
                int nextCol = curr.y + dCol[i];

                if (nextRow >= 0 && nextRow < m && nextCol >= 0 && nextCol < n) {
                    if (image[nextRow][nextCol] == originalColor) {
                        image[nextRow][nextCol] = color;
                        queue.addLast(new Point(nextRow, nextCol));
                    }
                }
            }
        }

        return image;
    }
}