class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n = s1.length();
        int[] mapE = new int[26];
        int[] mapO = new int[26];

        for(int i =0; i<n; i++){
            if((i&1) == 0){
                mapE[s1.charAt(i) - 'a']++;
                mapE[s2.charAt(i) - 'a']--;
            }
            else{
                mapO[s1.charAt(i) - 'a']++;
                mapO[s2.charAt(i) - 'a']--;
            }
        }

        for(int i =0; i<26; i++){
            if(mapE[i] != 0 || mapO[i] != 0) return false; 
        }
        return true;
    }
}