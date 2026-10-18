class Solution {
    public int longestPalindrome(String s) {
        boolean[] count = new boolean[128];
        int res = 0, ones = 0;
        for(int i=0; i<s.length(); i++){
            int index = s.charAt(i);
            if(count[index]){
                res += 2;
                ones--;
                count[index] = false;
            }
            else{
                count[index] = true;
                ones++;
            }
        }
        if(ones > 0) res++;
        return res;
    }
}