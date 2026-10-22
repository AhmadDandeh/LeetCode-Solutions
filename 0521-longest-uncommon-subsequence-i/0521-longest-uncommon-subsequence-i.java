class Solution {
    public int findLUSlength(String a, String b) {
        int n1 = a.length(), n2 = b.length();
        if(n1 == n2 && a.equals(b)) return -1;        
        return Math.max(n1, n2);
    }
}