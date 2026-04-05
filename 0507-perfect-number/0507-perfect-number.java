class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1) return false;
        int sum = 1;
        int sq = (int) Math.sqrt(num);
        for(int i =2; i<= sq; i++){
            if(num % i == 0){
                int j = num/i;
                if(i == j) sum += i;
                else sum += i + j;
            }
            if(sum > num) break; 
        }
        
        return sum == num;
    }
}