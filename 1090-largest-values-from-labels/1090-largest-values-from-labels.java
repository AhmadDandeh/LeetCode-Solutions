class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        
        if(numWanted < useLimit) useLimit = numWanted;
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0; i<values.length; i++){
            PriorityQueue<Integer> pq = map.computeIfAbsent(labels[i], k -> new PriorityQueue<>());
            if(pq.size() < useLimit){
                pq.add(values[i]);
            }
            else if(pq.peek() < values[i]){
                pq.poll();
                pq.add(values[i]);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(numWanted);
        for(PriorityQueue<Integer> p: map.values()){
            while(!p.isEmpty()){
                if(pq.size() < numWanted) pq.add(p.poll());
                else if(p.peek() > pq.peek()){
                    pq.poll();
                    pq.add(p.poll());
                }
                else p.poll();
            }
        }
        int ans = 0;
        while(!pq.isEmpty()){ans += pq.poll();}
        return ans;
    }
}