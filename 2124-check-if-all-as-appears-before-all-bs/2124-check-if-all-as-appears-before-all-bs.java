class Solution {
    public boolean checkString(String s) {
        boolean flag = false;
        for(char c: s.toCharArray()){
            if(c == 'a'){
                if(flag) return false;
            }
            else flag = true;
        }
        return true;
    }
}