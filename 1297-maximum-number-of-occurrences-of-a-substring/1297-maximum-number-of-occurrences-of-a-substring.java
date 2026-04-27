class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int sLen = s.length();
        if(sLen<minSize) return 0;
        HashMap<String, Integer> map = new HashMap<>();
        int letters = 0, ans =0;
        int[] count = new int[26];

        for(int i =0; i<minSize; i++) if(count[s.charAt(i)-'a']++ == 0) letters++;
        
        if(letters <= maxLetters){
            String ss = s.substring(0, minSize);
            ans = map.merge(ss, 1, Integer::sum);
        }

        for(int i =minSize; i<sLen; i++){
            if(--count[s.charAt(i-minSize)-'a'] == 0) letters--;
            if(count[s.charAt(i)-'a']++ == 0) letters++;
            if(letters <= maxLetters){
                String ss = s.substring(i+1-minSize, i+1);
                ans = Math.max(ans, map.merge(ss, 1, Integer::sum));
            }
        }
        return ans;
    }
}