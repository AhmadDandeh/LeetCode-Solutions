class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int p1 = 0;
        for(String word: words){
            for(char c:word.toCharArray()){
                if(p1 >= s.length() || s.charAt(p1++) != c) return false;
            }
            if(p1 == s.length()) return true;
        }
        return p1 == s.length();
    }
}