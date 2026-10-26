class Solution {
    public boolean checkRecord(String s) {
        int countA = 0, countL = 0, len = s.length();
        if(s.charAt(0) == 'A') countA++;
        else if(s.charAt(0) == 'L') countL++;
        for(int i =1; i<len; i++){
            char c = s.charAt(i);
            if(c == 'L'){
                countL++;
                if(countL == 3) return false;
            }
            else if(c == 'A'){
                countA++;
                if(countA == 2) return false;
                countL = 0;
            }
            else countL = 0;
        }
        return true;
    }
}