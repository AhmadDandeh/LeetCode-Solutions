class Solution {
    public int appendCharacters(String s, String t) {
        int sL = s.length(), tL = t.length();
        int pointer = 0;
        for(int i =0; i<sL && pointer<tL; i++) if(s.charAt(i) == t.charAt(pointer)) pointer++;
        return tL-pointer;
    }
}