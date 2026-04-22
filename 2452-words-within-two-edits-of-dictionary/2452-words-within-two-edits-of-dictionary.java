class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int wordLen = queries[0].length();
        if(wordLen<3) return new ArrayList<>(Arrays.asList(queries));
        List<String> ans = new ArrayList<>();
        for(String word: queries){
            for(String dic: dictionary){
                int edits = 0;
                for(int i =0; i<wordLen; i++){
                    if(word.charAt(i) != dic.charAt(i) && ++edits > 2) break;
                }
                if(edits<3){
                    ans.add(word);
                    break;
                }
            }
        }
        return ans;
    }
}