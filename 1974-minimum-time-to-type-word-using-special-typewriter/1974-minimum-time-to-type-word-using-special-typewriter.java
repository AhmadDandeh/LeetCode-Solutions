class Solution {
    public int minTimeToType(String word) {
        int ans = 0;
        char prev = 'a';
        for(char c: word.toCharArray()){
            int diff = Math.abs(c - prev);
            ans += Math.min(diff, 26-diff);
            prev = c;
        }
        return ans+word.length();
    }
}