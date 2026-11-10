class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        String[] arr = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String word: words){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<word.length(); i++) sb.append(arr[word.charAt(i) - 'a']);
            set.add(sb.toString());
        }
        return set.size();
    }
}