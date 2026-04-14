class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(cost1<cost2){
            int temp = cost1;
            cost1 = cost2;
            cost2 = temp;
        }
        long ans = 0;
        int maxP1 = total/cost1;
        for(int i =0; i<= maxP1; i++){
            long remain = total - i*cost1;
            long maxP2 = remain/cost2;
            ans = ans + maxP2 +1;
        }
        return ans;
    }
}