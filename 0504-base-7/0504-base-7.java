class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        boolean isNegative = num<0;
        StringBuilder sb = new StringBuilder();
        long n = Math.abs((long) num);
        while(n != 0){
            sb.append(n%7);
            n /= 7;
        }

        if(isNegative) sb.append('-');
        return sb.reverse().toString();
    }
}