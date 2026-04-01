class Solution {
    public int countGoodSubstrings(String s) {
        int len = s.length();
        if(len<3) return 0;
        int ans = 0;
        for (int i = 0; i < len-2; i++) {
            char a = s.charAt(i), b = s.charAt(i + 1), c = s.charAt(i + 2);
            if (a != b && a != c && b != c) ans++;
        }
        return ans;
    }
}