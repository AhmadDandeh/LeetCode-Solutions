class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];

        long dx = (long) coordinates[1][0] - x0;
        long dy = (long) coordinates[1][1] - y0;

        for (int i = 2; i < coordinates.length; i++) {
            long x = (long) coordinates[i][0] - x0;
            long y = (long) coordinates[i][1] - y0;

            if (dy * x != dx * y) {
                return false;
            }
        }

        return true;
    }
}