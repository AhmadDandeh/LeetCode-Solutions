class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1, j = b.length()-1;
        boolean carry = false;
        while(i>=0 && j>=0){
            if(a.charAt(i) == '1'){
                if(b.charAt(j) == '1'){
                    if(carry) sb.append("1");
                    else sb.append("0");
                    carry = true;
                }
                else{
                    if(carry) sb.append("0");
                    else sb.append("1");
                }
            }
            else{
                if(b.charAt(j) == '1'){
                    if(carry) sb.append("0");
                    else sb.append("1");
                }
                else{
                    if(carry) sb.append("1");
                    else sb.append("0");
                    carry = false;
                }
            }
            i--;
            j--;
        }
        while(i>=0){
            if(a.charAt(i) == '1'){
                if(carry) sb.append("0");
                else sb.append("1");
            }
            else{
                if(carry){
                    sb.append("1");
                    carry = false;
                }
                else{
                    sb.append("0");
                }
            }
            i--;
        }
        while(j>=0){
            if(b.charAt(j) == '1'){
                if(carry) sb.append("0");
                else sb.append("1");
            }
            else{
                if(carry){
                    sb.append("1");
                    carry = false;
                }
                else{
                    sb.append("0");
                }
            }
            j--;
        }
        if(carry) sb.append("1");
        return sb.reverse().toString();
    }
}