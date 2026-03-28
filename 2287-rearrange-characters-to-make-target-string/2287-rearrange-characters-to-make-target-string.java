class Solution {
    public int rearrangeCharacters(String s, String target) {
        if(s.length()<target.length()) return 0;
        int[] countS = new int[26];
        for(char c: s.toCharArray()){
            countS[c-'a']++;
        }
        
        int[] countT = new int[26];
        for(char c: target.toCharArray()){
            countT[c-'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for(int i =0; i<26; i++){
            if(countT[i] == 0) continue;
            if (countS[i] == 0) return 0; 
            ans = Math.min(ans, countS[i]/countT[i]);
        }
        return ans;
    }
}