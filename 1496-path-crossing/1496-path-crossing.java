class Solution {
    record Point(int i, int j){};
    public boolean isPathCrossing(String path) {
        HashSet<Point> set = new HashSet<>();
        int i=0, j=0;
        set.add(new Point(i,j));
        for(char c: path.toCharArray()){
            if(c == 'N') j++;
            else if(c == 'S') j--;
            else if(c == 'E') i++;
            else i--;
            if(!set.add(new Point(i,j))) return true;
        }
        return false;
    }
}