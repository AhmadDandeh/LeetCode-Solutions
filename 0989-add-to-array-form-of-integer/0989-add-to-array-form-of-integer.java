class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans  = new ArrayList<>();
        int index = num.length-1;
        int carry = 0;
        while(k>=0 && index>=0){
            num[index] = num[index] + (k%10) + carry;
            k /= 10;
            carry = (num[index] >=10)? 1:0;
            ans.add(num[index] %10);
            index--;
        }

        while(k>0 || carry == 1){
            int x = (k%10) + carry;
            ans.add(x%10);
            carry = (x >=10)? 1:0;
            k/=10;
        }

        Collections.reverse(ans);
        return ans;
    }
}