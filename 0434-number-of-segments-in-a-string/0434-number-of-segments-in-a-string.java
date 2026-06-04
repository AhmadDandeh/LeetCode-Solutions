class Solution {
    public int countSegments(String s) {
        int ans = 0, n = s.length();
        for(int i =0; i<n; i++){
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')) ans++;
        }
        return ans;
    }
}