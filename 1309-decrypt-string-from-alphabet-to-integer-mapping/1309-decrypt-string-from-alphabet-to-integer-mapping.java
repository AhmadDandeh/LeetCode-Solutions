class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i =0; i<n; ){
            if(i+2<n && s.charAt(i+2) == '#'){
                sb.append((char) ('a'+((s.charAt(i+1)-'0')+(s.charAt(i)-'0')*10)-1));
                i += 3;
            }
            else{
                sb.append((char) (s.charAt(i) + '0'));
                i++;
            }
        }
        return sb.toString();
    }
}