class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int n1 = num1.length(), n2 = num2.length(), i1 = n1-1, i2 = n2-1, carry = 0;
        while(carry == 1 || i1>= 0 || i2 >= 0){
            int sum = carry;
            carry = 0;
            if(i1>=0) sum += num1.charAt(i1) - '0';
            if(i2>=0) sum += num2.charAt(i2) - '0';
            if(sum >= 10){
                carry = 1;
                sum -= 10;
            }
            sb.append(sum);
            i1--;
            i2--;
        }
        return sb.reverse().toString();
    }
}