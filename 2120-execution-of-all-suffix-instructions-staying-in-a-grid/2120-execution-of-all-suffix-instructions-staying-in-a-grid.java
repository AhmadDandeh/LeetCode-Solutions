class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int sLen = s.length();
        int[] ans = new int[sLen];
        for(int i=0; i< sLen; i++){
            int steps = 0;
            int row = startPos[0];
            int col = startPos[1];
            for(int j=i; j< sLen; j++){
                char c = s.charAt(j);

                if(c == 'U') row--;
                else if(c == 'D') row++;
                else if(c == 'R') col++;
                else col--;
                
                if(col <0 || col == n || row == n || row <0) break;

                steps++;
            }
            ans[i] = steps;
        }
        return ans;
    }
}