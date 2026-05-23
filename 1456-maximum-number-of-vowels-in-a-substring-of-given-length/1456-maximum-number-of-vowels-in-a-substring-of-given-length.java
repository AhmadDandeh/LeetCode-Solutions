class Solution {
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int currentVowelsCount = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(chars[i])) {
                currentVowelsCount++;
            }
        }
        
        int maxVowelsCount = currentVowelsCount;
        if (maxVowelsCount == k) return k;
        for (int i = k; i < chars.length; i++) {
            if (isVowel(chars[i - k])) {
                currentVowelsCount--;
            }
            if (isVowel(chars[i])) {
                currentVowelsCount++;
            }
            
            if (currentVowelsCount > maxVowelsCount) {
                maxVowelsCount = currentVowelsCount;
                if (maxVowelsCount == k) return k;
            }
        }
        
        return maxVowelsCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}