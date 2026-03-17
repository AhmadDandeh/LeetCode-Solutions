class Solution {
    public int countBinarySubstrings(String s) {
        int ans = 0, n = s.length();
        int zeros = 0, ones = 0;
        boolean isZero = true;
        for(int i =0; i<n; i++){
            if(isZero){
                if(s.charAt(i) == '0'){
                    zeros++;
                }
                else{
                    ans += Math.min(zeros, ones);
                    ones = 1;
                    isZero = false;
                }
            }
            else{
                if(s.charAt(i) == '0'){
                    ans += Math.min(zeros, ones);
                    zeros = 1;
                    isZero = true;
                }
                else{
                    ones++;
                }
            }   
        }
        ans += Math.min(zeros, ones);
        return ans;
    }
}