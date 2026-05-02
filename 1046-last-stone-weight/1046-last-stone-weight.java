class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int s: stones) pq.add(s);
        while(pq.size()>1){
            int x1 = pq.remove();
            int x2 = pq.remove();
            if(x1 != x2) pq.add(x1-x2);
        }
        return pq.isEmpty() ? 0 : pq.remove();
    }
}