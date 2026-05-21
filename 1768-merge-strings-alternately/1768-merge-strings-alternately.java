class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = 0, w2=0, w1L = word1.length(), w2L = word2.length();
        StringBuilder sb = new StringBuilder();
        while(w1<w1L || w2<w2L){
            if(w1 < w1L) sb.append(word1.charAt(w1++));
            if(w2 < w2L) sb.append(word2.charAt(w2++));
        }
        return sb.toString();
    }
}