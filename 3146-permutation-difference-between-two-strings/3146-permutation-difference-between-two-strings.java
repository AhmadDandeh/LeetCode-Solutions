class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a'] += i;
            count[t.charAt(i)-'a'] -= i;
        } 
        int ans = 0;
        for(int c:count) ans += Math.abs(c);
        return ans;
    }
}