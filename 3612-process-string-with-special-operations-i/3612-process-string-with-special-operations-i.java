class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i = 0; i<len; i++){
            char c = s.charAt(i);
            if(c == '*'){
                if(sb.length() > 0) sb.deleteCharAt(sb.length()-1);
            }
            else if(c == '#') sb.append(sb.toString());
            else if(c == '%') sb.reverse();
            else sb.append(c);
        }
        return sb.toString();
    }
}