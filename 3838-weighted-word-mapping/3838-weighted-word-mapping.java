class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            int sum = 0, len = word.length();
            for(int i=0; i<len; i++){
                sum += weights[word.charAt(i)-'a'];
            }
            sum %= 26;
            char c =(char) ('z' -  sum);
            sb.append(c);
        }
        return sb.toString();
    }
}