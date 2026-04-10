class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int len = sb.length();
                if(len>0){
                    sb.deleteCharAt(len - 1);
                }
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}