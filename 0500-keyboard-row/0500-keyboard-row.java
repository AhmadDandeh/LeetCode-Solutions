class Solution {
    int[] group = new int[]{2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        for(String word:words){
            int g = detectGroup(word.charAt(0));
            for(int i = 1; i<word.length(); i++){
                if(detectGroup(word.charAt(i)) != g){
                    g = 0;
                    break;
                }
            }
            if(g != 0) ans.add(word);
        }
        return ans.toArray(new String[0]);
    }

    private int detectGroup(char c){
        if(c<'a') return group[c-'A'];
        else return group[c-'a'];
    }
}