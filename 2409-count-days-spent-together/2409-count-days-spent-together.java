class Solution {
    private static final int[] DAYS = new int[]{0,31,59,90,120,151,181,212,243,273,304,334};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aA = getDays(arriveAlice), lA = getDays(leaveAlice), aB = getDays(arriveBob), lB = getDays(leaveBob);
        return Math.max(0, Math.min(lA, lB) - Math.max(aA, aB) +1);
    }

    private int getDays(String s){
        int month = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        int day = (s.charAt(3) - '0') * 10 + (s.charAt(4) - '0');
        return DAYS[month - 1] + day;
    }
}