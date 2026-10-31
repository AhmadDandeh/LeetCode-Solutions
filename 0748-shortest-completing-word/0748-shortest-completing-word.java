class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] rec = new int[26];
        int len = 0;
        for(int i =0; i<licensePlate.length(); i++){
            char c = licensePlate.charAt(i);
            if(c <= 'z' && c>='a'){
                len++;
                rec[c-'a']++;
            }
            else if(c <= 'Z' && c>='A'){
                len++;
                rec[c-'A']++;
            }
        }
        String ans = "";
        int ansL = Integer.MAX_VALUE;
        for(String word:words){
            int wL = word.length();
            if(wL < len) continue;
            int[] cur = rec.clone();
            int curL = len;
            for(int i =0; i<wL; i++){
                int x = word.charAt(i) - 'a';
                if(cur[x]>0){
                    curL--;
                    cur[x]--;
                    if(curL == 0){
                        if(wL == len) return word;
                        if(wL < ansL){
                            ans = word;
                            ansL = wL;
                        }
                        break;
                    }
                }
            }
        }
        return ans;
    }
}