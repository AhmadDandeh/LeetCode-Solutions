class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans  = new ArrayList<Integer>();
        int index = num.length-1;
        int carry = 0;
        while(k>0 && index>=0){
            num[index] += (k%10) + carry;
            k /= 10;
            carry = (num[index] >=10)? 1:0;
            ans.add(num[index] %10);
            index--;
        }

        while(k>0){
            k += carry;
            ans.add(k%10);
            carry = (k >=10)? 1:0;
            k/=10;
        }

        while(index>=0){
            num[index] += carry;
            ans.add(num[index]%10);
            carry = (num[index] >=10)? 1:0;
            index--;
        }
        if(carry == 1) ans.add(1);

        Collections.reverse(ans);
        return ans;
    }
}