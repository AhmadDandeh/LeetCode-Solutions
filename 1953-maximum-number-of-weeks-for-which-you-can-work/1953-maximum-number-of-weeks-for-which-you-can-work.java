class Solution {
    public long numberOfWeeks(int[] milestones) {
        long sum = 0;
        int max = milestones[0];
        for(int m: milestones){
            sum += m;
            max = Math.max(max, m);
        }
        return (sum>= 2L * max)? sum:2*(sum-max)+1;
    }
}