class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int len = sb.length();
            if(len>0 && (sb.charAt(len-1) == (char) (c^32))){
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}