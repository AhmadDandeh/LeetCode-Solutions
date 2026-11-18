class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length(), p2 = n-1;
        for(int p1 = 0; p1<n; p1++){
            char c = s.charAt(p1);
            if(!isLetter(c)) sb.append(c);
            else{
                while(!isLetter(s.charAt(p2))) p2--;
                sb.append(s.charAt(p2--));
            }
        }
        return sb.toString();
    }

    private boolean isLetter(char c){
        return (c>='a' && c<='z') || (c>='A' && c <='Z');
    }
}