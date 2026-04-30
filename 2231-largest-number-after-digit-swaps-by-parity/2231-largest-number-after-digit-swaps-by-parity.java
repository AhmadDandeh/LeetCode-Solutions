class Solution {
    public int largestInteger(int num) {
        int num2 = num;
        PriorityQueue<Integer> even = new PriorityQueue<>();
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        while(num2 > 0){
            int x = num2%10;
            if((x&1) == 0) even.add(x);
            else odd.add(x);
            num2 /= 10;
        }
        int ans = 0;
        int i = 1;
        while(num>0){
            if((num&1) == 0) ans = ans + even.poll() * i;
            else ans = ans + odd.poll() * i;
            num /= 10;
            i *= 10;
        }
        return ans;
    }
}