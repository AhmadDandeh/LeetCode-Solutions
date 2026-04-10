class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        int zeros = 0;
        int ones = 0;
        int left = 0;
        int n = s.length();
        for(int right = 0; right< n; right++){
            if(s.charAt(right) == '0') zeros++;
            else ones++;

            while(zeros > k && ones > k){
                if(s.charAt(left++) == '0') zeros--;
                else ones--;
            }
            count += right-left+1;
        }
        return count;
    }
}