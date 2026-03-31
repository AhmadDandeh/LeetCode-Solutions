class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1){
            return word;
        }
        else{
    	    return new StringBuilder().append(word.substring(0, index+1)).reverse().append(word.substring(index+1)).toString();

        }
    }
}