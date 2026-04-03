class Solution {
    public boolean makeStringsEqual(String s, String target) {
        int index1 = s.indexOf("1");
        int index2 = target.indexOf("1");

        if((index1 == -1 && index2 == -1) || (index1>-1 && index2>-1)){
            return true;
        }
        else{
            return false;
        }
    }
}