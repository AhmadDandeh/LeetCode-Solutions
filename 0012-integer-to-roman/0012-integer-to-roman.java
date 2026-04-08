class Solution {
    public String intToRoman(int num) {
        String[][] roman = new String[][]{
            {"I", "II", "III", "VI", "V","IV", "IIV", "IIIV", "XI"},
            {"X", "XX", "XXX", "LX", "L","XL","XXL","XXXL", "CX"},
            {"C", "CC", "CCC", "DC", "D", "CD", "CCD", "CCCD", "MC"},
            {"M", "MM", "MMM"}
        };

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< 4 ; i++){
            int x = num%10;
            num = num/10;
            if(x>0) sb.append(roman[i][x-1]);
        }
        return sb.reverse().toString();
    }
}