class Solution {
    public boolean judgeCircle(String moves) {
        int ud = 0, lr = 0;
        for(char c: moves.toCharArray()){
            if(c == 'R') lr++;
            else if(c == 'L') lr--;
            else if( c == 'U') ud++;
            else ud--;
        }
        return (ud == 0) && (lr == 0);
    }
}