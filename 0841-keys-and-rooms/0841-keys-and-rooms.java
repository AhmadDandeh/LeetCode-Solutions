class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size()-1;
        if(n == 0) return true;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(0);
        while(!dq.isEmpty()){
            for(int room: rooms.get(dq.removeFirst())){
                if(!set.contains(room)){
                    n--;
                    dq.addLast(room);
                    set.add(room);
                    if(n == 0) return true;
                }
            }
        }
        return false;
    }
}