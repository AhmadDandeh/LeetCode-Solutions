class Solution {
    public long validSubstringCount(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m < n) return 0;

        long validSubstringsCount = 0;
        
        int[] charCounts = new int[26];
        int requiredChars = 0;

        for (int i = 0; i < n; i++) {
            int idx = word2.charAt(i) - 'a';
            if (charCounts[idx] == 0) {
                requiredChars++;
            }
            charCounts[idx]++;
        }

        int left = 0;
        
        for (int right = 0; right < m; right++) {
            int idxR = word1.charAt(right) - 'a';
            charCounts[idxR]--;
            
            if (charCounts[idxR] == 0) {
                requiredChars--;
            }

            while (requiredChars == 0) {
                validSubstringsCount += (m - right);
                
                int idxL = word1.charAt(left) - 'a';
                if (charCounts[idxL] == 0) {
                    requiredChars++;
                }
                charCounts[idxL]++;
                left++;
            }
        }

        return validSubstringsCount;
    }
    /*
    public long validSubstringCount(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if(m<n) return 0;

        long ans = 0;
        // Hashing
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(char c: word2.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
            set.add(c);
        }

        // Sliding Window
        int left = 0;
        for(int right =0; right<m; right++){
            char cR = word1.charAt(right);
            if(map.containsKey(cR)){
                map.put(cR, map.get(cR)-1);
                if(map.get(cR) == 0){
                    set.remove(cR);
                }
            }

            while(set.isEmpty()){
                ans += m-right;
                char cL = word1.charAt(left);
                if(map.containsKey(cL)){
                    map.put(cL, map.get(cL)+1);
                    if(map.get(cL) > 0) set.add(cL);
                }
                left++;
            }
        }
        return ans;
    }
    */
}