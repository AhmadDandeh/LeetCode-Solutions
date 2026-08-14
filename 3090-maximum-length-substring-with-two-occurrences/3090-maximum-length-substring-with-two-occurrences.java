class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0, n = s.length(), max = 0;
        int[] seen = new int[26];
        for(int right =0; right<n; right++){
            int x = s.charAt(right) - 'a';
            seen[x]++;
            while(seen[x]>2){
                seen[s.charAt(left++) - 'a']--;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}