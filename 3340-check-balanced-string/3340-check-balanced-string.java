class Solution {
    public boolean isBalanced(String num) {
        int sum = 0;
        boolean flag = true;
        for(char n: num.toCharArray()){
            if(flag) sum += n;
            else sum -= n;
            flag = !flag;
        }
        return flag? sum == 0 : sum == '0';
    }
}