class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        int index = s.indexOf('0');
        if(index == -1) return true;
        for(int i = index+1; i<n; i++){
            if(s.charAt(i) == '1') return false;
        }
        return true;
    }
}