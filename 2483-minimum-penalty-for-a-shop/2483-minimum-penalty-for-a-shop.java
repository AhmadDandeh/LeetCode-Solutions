class Solution {
    public int bestClosingTime(String customers) {
        int ans = customers.length();
        int i = ans - 1;
        int diff = 0;
        int min = 0;
        while(i>=0){
            if(customers.charAt(i) == 'Y') diff++;
            else{
                diff--;
                if(diff<=min){
                    ans = i;
                    min = diff;
                }
            }
            i--;
        }
        return ans;
    }
}