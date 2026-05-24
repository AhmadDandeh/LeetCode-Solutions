class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i =0; i<n; i += k){
            int sum = 0;
            for(int j =0; j<k; j++){
                sum += s.charAt(j+i) -'a';
            }
            sb.append((char) ((sum%26)+'a'));
        }
        return sb.toString();
    }
}