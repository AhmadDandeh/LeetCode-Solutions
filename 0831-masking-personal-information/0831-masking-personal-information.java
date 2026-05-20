class Solution {
    public String maskPII(String s) {
        int n = s.length();
        if(isChar(s.charAt(n-1))) return manipulateEmail(s, n);
        else return manipulateNumber(s, n);
    }

    private boolean isChar(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z');
    }

    private String manipulateEmail(String s, int n){
        StringBuilder sb = new StringBuilder();
        int index = s.indexOf('@');
        sb.append(Character.toLowerCase(s.charAt(0)));
        sb.append("*****");
        sb.append(Character.toLowerCase(s.charAt(index-1)));
        sb.append(s.substring(index).toLowerCase());
        return sb.toString();
    }

    private String manipulateNumber(String s, int n){
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for(int i = n-1; i>=0; i--){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                if(len == 4) sb.append('-');
                if(len == 7) sb.append('-');
                if(len == 10) sb.append('-');
                
                if(len<4) sb.append(c);
                else sb.append('*');
                len++;
            }
        }
        if(len>10) sb.append('+');
        return sb.reverse().toString();
    }
}