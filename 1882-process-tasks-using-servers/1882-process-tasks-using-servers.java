class Solution {
    record Data(int capacity, int index){};
    record Busy(long finish, int index) {}

    public int[] assignTasks(int[] servers, int[] tasks) {
        int[] ans = new int[tasks.length];
        if(servers.length == 1){
            Arrays.fill(ans, 0);
            return ans;
        }
        PriorityQueue<Data> pq = new PriorityQueue<>(
            (x, y) -> {
                if(x.capacity > y.capacity) return 1;
                else if(x.capacity < y.capacity) return -1;
                else{
                    if(x.index > y.index) return 1;
                    else return -1;
                }
            }
        );
        for(int i =0; i<servers.length; i++){
            pq.add(new Data(servers[i], i));
        }
        PriorityQueue<Busy> pqH = new PriorityQueue<>(
            (x, y) -> Long.compare(x.finish, y.finish)
        );
        long t = 0;
        int i =0;
        while(i<tasks.length){
            if (pq.isEmpty()) t = pqH.peek().finish;
            
            while(!pqH.isEmpty() && pqH.peek().finish <= t){
                Busy d = pqH.poll();
                pq.add(new Data(servers[d.index], d.index));
            }
            while(!pq.isEmpty() && i <= t && i<tasks.length){
                Data d = pq.poll();
                pqH.add(new Busy((long) tasks[i] + t, d.index));
                ans[i++] = d.index;
            }
            t++;
        }
        return ans;
    }
}