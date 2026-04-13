class Solution {
    public String reverseWords(String s) {
        int lastChar = s.length();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                if(flag){
                    sb.append(s.substring(i+1, lastChar+1));
                    sb.append(' ');
                    flag = false;
                }
            }
            else{
                if(!flag){
                    lastChar = i;
                    flag = true;
                }
            }
        }
        

        if(s.charAt(0) != ' ') sb.append(s.substring(0, lastChar+1));
        else{
            if(sb.isEmpty()) return "";
            else sb.setLength(sb.length()-1);
        }
        return sb.toString();
    }
}