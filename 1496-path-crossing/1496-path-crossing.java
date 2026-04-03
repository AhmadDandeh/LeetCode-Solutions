class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<Integer> set = new HashSet<>();
        int i=0, j=0;
        set.add(0);
        for(char c: path.toCharArray()){
            if(c == 'N') j++;
            else if(c == 'S') j--;
            else if(c == 'E') i++;
            else i--;
            if(!set.add(i*20001+j)) return true;
        }
        return false;
    }
}