class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int sL = searchWord.length();
        String[] split = sentence.split(" ");
        
        for(int i =0; i<split.length; i++){
            int pointer = 0;
            for(int j =0; j<split[i].length(); j++){
                if(split[i].charAt(j) != searchWord.charAt(pointer)) break;
                else{
                    pointer++;
                    if(pointer == sL) return i+1;
                }
            }
        }
        return -1;
    }
}