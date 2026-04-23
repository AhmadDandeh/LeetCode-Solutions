class Solution {
    public String makeSmallestPalindrome(String s) {
        int left =0, right = s.length()-1;
        char[] cs = s.toCharArray();
        while(left<right){
            if(cs[left] != cs[right]){
                if(cs[left] < cs[right]){
                    cs[right] = cs[left];
                }
                else{
                    cs[left] = cs[right];
                }
            }
            left++;
            right--;
        }
        return new String(cs);
    }
}