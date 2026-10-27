class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        ans[0] = ".".repeat(n);
        if (m > 1) {
            String otherRow = "#".repeat(n - 1) + ".";
            for (int i = 1; i < m; i++) {
                ans[i] = otherRow;
            }
        }
        return ans;
    }
}