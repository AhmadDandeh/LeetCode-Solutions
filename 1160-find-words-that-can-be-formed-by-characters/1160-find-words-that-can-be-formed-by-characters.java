class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for(char c: chars.toCharArray()){
            count[c-'a']++;
        }
        int ans =0;
        for(String word: words){
            if(word.length() > chars.length()) continue;
            if(helper(word, count.clone())) ans += word.length();
        }
        return ans;
    }

    private boolean helper(String word, int[] count){
        for(char c: word.toCharArray()){
            if(count[c-'a']-- == 0) return false;
        }
        return true;
    }
}