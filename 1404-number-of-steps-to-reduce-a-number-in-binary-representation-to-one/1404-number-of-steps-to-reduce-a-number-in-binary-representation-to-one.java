class Solution {
    public int numSteps(String s) {
        int carrySteps = 0;
        boolean carry = false;
        int n = s.length();
        for(int i = n-1; i>0; i--){
            if(s.charAt(i) == '0' && carry) carrySteps++;
            else if(s.charAt(i) == '1' && !carry){
                    carrySteps++;
                    carry = true;
            }
            carrySteps++;
        }
        if(carry) carrySteps++;
        return carrySteps;
    }
}