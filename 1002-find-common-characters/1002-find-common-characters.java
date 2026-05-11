class Solution {
    public List<String> commonChars(String[] words) {
        int[] result = new int[26];
        for(char c: words[0].toCharArray()){
            result[c-'a']++;
        }

        for(int i =1; i<words.length; i++){
            int[] helper = new int[26];
            for(char c: words[i].toCharArray()){
                helper[c-'a']++;
            }
            for(int j=0; j<26; j++){
                result[j] = Math.min(result[j], helper[j]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(int j=0; j<26; j++){
            while(result[j]>0){
                ans.add((char)(j+'a')+"");
                result[j]--;
            } 
        }
        return ans;
    }
}