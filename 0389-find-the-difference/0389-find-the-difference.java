class Solution {
    public char findTheDifference(String s, String t) {
        int n = s.length();
        char result = t.charAt(n);
        for(int i =0; i<n; i++){
            result ^= s.charAt(i);
            result ^= t.charAt(i);
        }
        return result;
    }
}