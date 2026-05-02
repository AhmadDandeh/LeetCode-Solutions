class Solution {
    public String firstPalindrome(String[] words) {
        for(String word :words){
            int left = 0, right= word.length()-1;
            while(word.charAt(left) == word.charAt(right)){
                if(left>=right){
                    return word;
                }
                left++;
                right--;
            }
        }
        return "";
    }
}