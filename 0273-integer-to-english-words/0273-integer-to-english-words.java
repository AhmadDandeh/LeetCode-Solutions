class Solution {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";

        StringBuilder sb = new StringBuilder();
        String[] ONES = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", 
                         "Eight ", "Nine "};
        String[] TEENS = {"Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", 
                          "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
        String[] TENS = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", 
                         "Seventy ", "Eighty ", "Ninety "};
        String[] SCALE_NAMES = {"Billion ", "Million ", "Thousand ", ""};
        int[] triples = new int[4];
        for(int i = 3; i>=0 && num>0; i--){
            triples[i] = num%1000;
            num /= 1000;
        }

        for(int i = 0; i<4 ; i++){
            int n = triples[i];
            if(n == 0) continue;

            int hundred = n/100;
            if(hundred != 0) sb.append(ONES[hundred]).append("Hundred ");

            n %= 100;
            if(n > 9 && n<20) sb.append(TEENS[n-10]);
            else{
                if(n>19) sb.append(TENS[n/10]);
                sb.append(ONES[n%10]);
            }
            sb.append(SCALE_NAMES[i]);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}