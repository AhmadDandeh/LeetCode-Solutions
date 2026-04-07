class Solution {
    public int myAtoi(String s) {
        boolean positive = true;
        int index = 0;
        int sLen = s.length();

        while(index<sLen && s.charAt(index) == ' ') index++;
        if(index<sLen && s.charAt(index) == '-'){
            positive = false;
            index++;
        }
        else if(index<sLen && s.charAt(index) == '+') index++;

        long ans = 0;
        while(index<sLen && s.charAt(index)>='0' && s.charAt(index)<='9'){
            ans = ans*10 + (s.charAt(index) - '0');
            index++;
            if(positive && ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(!positive && ans-1>Integer.MAX_VALUE) return Integer.MIN_VALUE;
        }

        return positive? (int) ans: (int) ans*-1;
    }
}