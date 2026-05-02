class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int left =0, index = s.indexOf(" "), right;
        while(index != -1){
            right = index-1;
            while(left<right){
                char temp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = temp;
            }
            left = index+1;
            index = s.indexOf(" ", index+1);
        }
        right = n-1;
        while(left<right){
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }
}