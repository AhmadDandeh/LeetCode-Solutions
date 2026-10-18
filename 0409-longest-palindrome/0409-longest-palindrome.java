class Solution {
    public int longestPalindrome(String s) {
        int[] sm = new int[26];
        int[] bi = new int[26];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) <= 'Z') bi[s.charAt(i)-'A']++;
            else sm[s.charAt(i)-'a']++;
        }
        int one = 0, len = 0;
        for(int i=0; i<26; i++){
            len = len + sm[i]/2 + bi[i]/2;
            one = one | sm[i]%2 | bi[i]%2;
        }
        return len * 2 + one;
    }
}