class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num * 9 < sum) return "";
        StringBuilder sb = new StringBuilder();
        while(sum > 0){
            int x = Math.min(sum, 9);
            sb.append(x);
            sum -= x;
            num--;
        }
        while(num > 0){
            sb.append('0');
            num--;
        }
        return sb.toString();
    }
}