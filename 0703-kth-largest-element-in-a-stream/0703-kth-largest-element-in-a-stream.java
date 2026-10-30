class KthLargest {
    private PriorityQueue<Integer> pq;
    private int limit;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>(k);
        limit = k;
        for(int num: nums) pq.add(num);
        while(pq.size()>k) pq.poll();
    }
    
    public int add(int val) {
        if(pq.size()<limit) pq.add(val);
        else if(val > pq.peek()){
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */