class RecentCounter {
    Deque<Integer> dq;
    public RecentCounter() {
        dq = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        int start = t - 3000;
        while(!dq.isEmpty() && dq.peekFirst() < start) dq.removeFirst();
        dq.addLast(t);
        return dq.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */