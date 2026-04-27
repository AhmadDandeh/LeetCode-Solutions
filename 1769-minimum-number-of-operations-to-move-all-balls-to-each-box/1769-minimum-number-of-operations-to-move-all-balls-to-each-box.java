class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        int movesL = 0, countL =0;
        int movesR = 0, countR =0;

        for(int i=0; i<n; i++){
            ans[i] += movesL;
            ans[n-1-i] += movesR;
            countL += boxes.charAt(i) - '0';
            movesL += countL;
            countR += boxes.charAt(n-1-i) - '0';
            movesR += countR;
        }
        
        return ans;
    }
}