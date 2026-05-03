class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans =0;
        for(int i=0; i< patterns.length; i++){
            if(word.indexOf(patterns[i])>-1){
                ans++;
            }
        }
        return ans;
    }
}