class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length()<= numRows) return s;
        StringBuilder sb = new StringBuilder();
        int index, n = s.length();
        for(int i =0; i<numRows; i++){
            index = i;
            if(i == 0 || i == numRows-1){
                while(index < n){
                    sb.append(s.charAt(index));
                    index += 2*(numRows-1);
                }
            }
            else{
                boolean zigzag = false;
                while(index < n){
                    if(zigzag){
                        sb.append(s.charAt(index));
                        index += 2*i;
                        zigzag = false;
                    }
                    else{
                        sb.append(s.charAt(index));
                        index += 2*(numRows-1-i);
                        zigzag = true;
                    }
                }
            }
        }
        return sb.toString();
    }
}