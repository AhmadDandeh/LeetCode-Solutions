class Solution {
    /**
     * Using Concatination Property
     * We can solve it using LPS
     */
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString().indexOf(s) != -1;
    }
}