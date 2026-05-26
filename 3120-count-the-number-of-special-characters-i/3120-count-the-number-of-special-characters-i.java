class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] low = new boolean[26];
        boolean[] upp = new boolean[26];
        int n = word.length();
        for(int i =0; i<n; i++){
            char c = word.charAt(i);
            if(c>='a' && c<='z') low[c-'a'] = true;
            else if(c>='A' && c<='Z') upp[c-'A'] = true;
        }
        int ans = 0;
        for(int i=0; i<26; i++){
            if(low[i] && upp[i]) ans++;
        }
        return ans;
    }
}