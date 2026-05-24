class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChars = new boolean[26];
        for (char c : allowed.toCharArray()) {
            allowedChars[c - 'a'] = true;
        }
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!allowedChars[c - 'a']) {
                    isConsistent = false;
                    break;
                }
            }    
            if (isConsistent) {
                count++;
            }
        }        
        return count;
    }

    /*
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(char c: allowed.toCharArray()) set.add(c);
        int ans =0;
        for(String word:words){
            boolean flag = true;
            for(char c: word.toCharArray()){
                if(!set.contains(c)){
                    flag = false;
                    break;
                }
            }
            if(flag) ans++;
        }
        return ans;
    }
    */
}