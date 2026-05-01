class Solution {
    public int longestContinuousSubstring(String s) {
        int ans = 1, count = 1;
        char[] c = s.toCharArray();
        for (int i = 1; i < c.length; i++) {
            if (c[i] == c[i - 1] + 1) {
                count++;
                if (count > ans) ans = count;
            } else {
                count = 1;
            }
        }
        return ans;
    }
}