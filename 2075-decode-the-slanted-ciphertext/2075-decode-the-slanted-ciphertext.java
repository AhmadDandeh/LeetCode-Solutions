class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        StringBuilder sb = new StringBuilder();
        int n = encodedText.length();
        int cols = n/rows;
        int next = cols +1;
        int curr = 0;
        for(int i=0; i<cols; i++){
            curr = i;
            for(int j=0; j<rows; j++){
                sb.append(encodedText.charAt(curr));
                curr += next;
                if(curr>=n) break;
            }
        }
        
        return sb.toString().stripTrailing();
    }
}