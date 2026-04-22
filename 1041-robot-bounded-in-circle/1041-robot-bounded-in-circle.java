class Solution {
    public boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        int dir = 0; // 0 = north, 1 = right, 2 = south, 3 = left

        for(char c: instructions.toCharArray()){
            if(c == 'L') dir = (dir+3)%4;
            else if(c == 'R') dir = (dir+1)%4;
            else{ // c == 'G'
                if(dir == 0) y++;
                else if(dir == 1) x++;
                else if(dir == 2) y--;
                else x--;
            }
        }

        return ((dir != 0 ) || (x==0 && y==0));
    }
}