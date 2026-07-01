class Solution {
    /**
     * Using Concatination Property
     * We can solve it using LPS
     */
    public boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(1,s.length()*2-1).contains(s);
    }
}