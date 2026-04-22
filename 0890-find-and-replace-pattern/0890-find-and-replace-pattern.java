class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] s, t;
        int n = pattern.length();
        List<String> ans = new ArrayList<>();
        for(String word: words){
            s = new int[26];
            t = new int[26];
            int i =0;
            for(; i<n; i++){
                int i1 = word.charAt(i)-'a';
                int i2 = pattern.charAt(i)-'a';
                if(s[i1] != t[i2]) break;
                s[i1] = t[i2] = i+1;
            }
            if(i == n) ans.add(word);
        }
        return ans;
    }
}