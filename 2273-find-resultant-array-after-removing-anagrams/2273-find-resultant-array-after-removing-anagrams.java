class Solution {
    public List<String> removeAnagrams(String[] words) {
        String pSignature = "";
        List<String> ans = new ArrayList<>();
        for(String word: words){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String signature = new String(c);
            if(!pSignature.equals(signature)) ans.add(word);
            pSignature = signature;
        }
        return ans;
    }
}