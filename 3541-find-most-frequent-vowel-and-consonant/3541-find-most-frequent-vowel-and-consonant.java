class Solution {
    public int maxFreqSum(String s) {
        int[] chars = new int[26];
        for(char c: s.toCharArray()){
            chars[c-'a']++;
        }

        int maxV = 0, maxC = 0;
        for(int i=0; i<26; i++){
            switch(i){
                case 0, 4, 8, 14,20:
                    maxV = Math.max(maxV, chars[i]); 
                    break;
                default: 
                    maxC = Math.max(maxC, chars[i]);
            }
        }
        return maxV + maxC;
    }
}