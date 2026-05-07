class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i =left; i<=right; i++){
            if(isPrime(Integer.bitCount(i))) ans++;
        }
        return ans;
    }

    private boolean isPrime(int x){
        if(x == 1) return false;
        if(x == 2) return true;
        if(x%2 == 0) return false;
        for(int i =3; i*i<=x; i += 2){
            if(x%i == 0) return false;
        }
        return true;
    }
}