class Solution {
    record Pair(int value, int index){};
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (x, y) -> y.value - x.value
        );
        for(int i =0; i<score.length; i++){
            pq.add(new Pair(score[i], i));
        }
        int c = 1;
        String[] ans = new String[score.length];
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            if(c == 1) ans[p.index] = "Gold Medal";
            else if(c == 2) ans[p.index] = "Silver Medal";
            else if(c == 3) ans[p.index] = "Bronze Medal";
            else ans[p.index] = String.valueOf(c);
            c++;
        }
        return ans;
    }
}