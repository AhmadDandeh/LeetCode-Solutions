class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(!set.add(n)) return false;
            n = sum(n);
        }
        return true;
    }

    public int sum(int n){
        int sum = 0;
        while(n>0){
            int d = n%10;
            sum += d*d;
            n /=10;
        }
        return sum;
    }
}