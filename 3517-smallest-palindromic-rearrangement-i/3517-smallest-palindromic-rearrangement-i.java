class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length(), mid = n/2;
        char[] c = s.substring(0, mid).toCharArray();
        Arrays.sort(c);
        char[] ans = new char[n];
        int l = 0, r = n-1;
        for(char cc: c){
            ans[l++] = cc;
            ans[r--] = cc;
        }
        if((n & 1) == 1) ans[mid] = s.charAt(mid);
        return new String(ans);
    }
}