class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0, n = columnTitle.length();
        for(int i =0; i<n; i++){
            ans = ans*26 + (columnTitle.charAt(i) -'A'+1);
        }
        return ans;
    }
}