class Solution {
    public double separateSquares(int[][] squares) {
        double totalArea = 0.0;
        double lowestY = Double.POSITIVE_INFINITY;
        double highestY = Double.NEGATIVE_INFINITY;

        for (int[] square : squares) {
            double y0 = square[1];
            double side = square[2];
            
            lowestY = Math.min(lowestY, y0);
            highestY = Math.max(highestY, y0 + side);
            totalArea += side * side;
        }

        double targetArea = totalArea / 2.0;
        double lo = lowestY;
        double hi = highestY;

        for (int iter = 0; iter < 80; iter++) {
            double mid = lo + (hi - lo) / 2.0;
            
            if (getAreaBelow(squares, mid) >= targetArea) {
                hi = mid;
            } else {
                lo = mid;
            }
        }
        return lo;
    }

    private double getAreaBelow(int[][] squares, double yLine) {
        double totalAreaBelow = 0.0;

        for (int[] square : squares) {
            double y0 = square[1];
            double side = square[2];
            
            if (yLine <= y0) continue;

            double heightBelow = Math.min(side, yLine - y0);
            totalAreaBelow += side * heightBelow;
        }
        return totalAreaBelow;
    }
}