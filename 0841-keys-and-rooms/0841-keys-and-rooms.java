class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size()-1;
        if(n == 0) return true;
        boolean[] visited = new boolean[n+1];
        visited[0] = true;
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(0);
        while(!dq.isEmpty()){
            for(int room: rooms.get(dq.removeFirst())){
                if(!visited[room]){
                    n--;
                    dq.addLast(room);
                    visited[room] = true;
                    if(n == 0) return true;
                }
            }
        }
        return false;
    }
}