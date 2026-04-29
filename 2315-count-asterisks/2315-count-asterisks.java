class Solution {
    public int countAsterisks(String s) {
        boolean b = true;
        int count =0;
        for(char c: s.toCharArray()){
            if(c == '|'){
                b = !b;
            }
            else if(c == '*' && b){
                count++;
            }
        }
        return count;
    }
}