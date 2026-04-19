class Solution {
    public long kMirror(int k, int n) {
        long ans = 0;
        long start = 1, end = start * 10;
        while(n>0){
            for(long i = start; i <end; i++){
                // odd
                long num = i /10;
                long full = i;
                while(num>0){
                    full = full*10 + num%10;
                    num /=10;
                }
                if(isMirrorInBaseK(full, k)){
                    ans += full;
                    n--;
                    if(n == 0) return ans;
                }
            }
            for(long i = start; i <end; i++){
                // even
                long num = i;
                long full = i;
                while(num>0){
                    full = full*10 + num%10;
                    num /=10;
                }
                if(isMirrorInBaseK(full, k)){
                    ans += full;
                    n--;
                    if(n == 0) return ans;
                }
            }
            start *= 10;
            end *= 10;
        }
        return ans;
    }

    public boolean isMirrorInBaseK(long number, int k) {
        long reversed = 0;
        long temp = number;
        while (temp > 0) {
            reversed = reversed * k + (temp % k);
            temp /= k;
        }
        return reversed == number;
    }
}