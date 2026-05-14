class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if((n & 1) == 0){
            sb.append('a');
            n--;
        }

        for(int i =0 ;i<n; i++) sb.append('b');
        return sb.toString();
    }
}