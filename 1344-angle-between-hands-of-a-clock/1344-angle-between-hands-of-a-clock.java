class Solution {
    public double angleClock(int hour, int minutes) {
        if (hour == 12) hour = 0;
        double m = minutes * 6;
        double h = (hour * 30) + (minutes * 0.5);
        double diff = Math.abs(h - m);
        return Math.min(diff, 360 - diff);
    }
}