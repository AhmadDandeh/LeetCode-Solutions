class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long maxSquareArea = 0;
        int n = bottomLeft.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int intersectLeft = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                int intersectRight = Math.min(topRight[i][0], topRight[j][0]);
                int intersectBottom = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                int intersectTop = Math.min(topRight[i][1], topRight[j][1]);
                long width = intersectRight - intersectLeft;
                long height = intersectTop - intersectBottom;
                
                if (width > 0 && height > 0) {
                    long side = Math.min(width, height);
                    long currentArea = side * side;
                    maxSquareArea = Math.max(maxSquareArea, currentArea);
                }
            }
        }
        return maxSquareArea;
    }
}