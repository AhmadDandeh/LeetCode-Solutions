class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int right = s.length();
        for(int left = 0; left<right; left++){
            if(isVowel(chars[left])){
                while(left<right){
                    right--;
                    if(isVowel(chars[right])){
                        char temp = chars[left];
                        chars[left] = chars[right];
                        chars[right] = temp;
                        break;
                    }
                }
            }
        }
        return new String(chars);
    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'A' || 
        c == 'e' || c == 'E' ||
        c == 'i' || c == 'I' ||
        c == 'o' || c =='O' ||
        c == 'u' || c == 'U';
    }
}