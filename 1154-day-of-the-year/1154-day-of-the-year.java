class Solution {
    public int dayOfYear(String date) {
        int[] months = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304,334};
        int ans = 0;
        int d = Integer.parseInt(date.substring(8));
        int m = Integer.parseInt(date.substring(5, 7));
        int y = Integer.parseInt(date.substring(0,4));
        if (m > 2 && (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))) ans++;
        return ans + d + months[m-1];
    }
}