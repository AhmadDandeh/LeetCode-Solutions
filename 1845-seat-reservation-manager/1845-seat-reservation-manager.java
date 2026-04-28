class SeatManager {
    PriorityQueue<Integer> pq;
    int availableSeat;
    public SeatManager(int n) {
        pq = new PriorityQueue<>();
        availableSeat = 1;
    }
    
    public int reserve() {
        if(!pq.isEmpty() && pq.peek() < availableSeat){
            return pq.poll();
        }
        return availableSeat++;
    }
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */