class Solution {
    public boolean isSubsequence(String s, String t) {
        int sL = s.length(), tL = t.length();
        if(sL == 0) return true;
        if(sL>tL) return false;

        int sP = 0;
        for(int i = 0; i< tL; i++){
            if(s.charAt(sP) == t.charAt(i)) sP++;
            if(sP == sL) return true;
        }
        return false;
    }
}