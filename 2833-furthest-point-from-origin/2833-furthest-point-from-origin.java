class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int pos = 0, under = 0;
        for(char c: moves.toCharArray()){
            if(c == 'L') pos--;
            else if(c == 'R') pos++;
            else under++;
        }
        return Math.abs(pos)+under;
    }
}