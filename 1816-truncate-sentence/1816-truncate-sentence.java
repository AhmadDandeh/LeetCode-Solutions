class Solution {
    public String truncateSentence(String s, int k) {
        int index = -1;
        while(k>0){
            index = s.indexOf(" ", index+1);
            k--;
        }
        return index == -1? s: s.substring(0, index);
    }
}