class Solution {
    record Edge(int v, int w){}
    public int minCost(int n, int[][] edges) {
        // Store in and out edges
        List<Edge>[] out = new ArrayList[n];
        List<Edge>[] in  = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            out[i] = new ArrayList<>();
            in[i]  = new ArrayList<>();
        }
        for(int[] e:edges){
            in[e[1]].add(new Edge(e[0], e[2]));
            out[e[0]].add(new Edge(e[1], e[2]));
        }

        // Dijkstra
        boolean[] visited = new boolean[n];
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.w));
        pq.add(new Edge(0,0));
        while(!pq.isEmpty()){
            Edge polled = pq.poll();
            if(visited[polled.v]) continue;
            if(polled.v == n-1) return polled.w;
            visited[polled.v] = true;
            for(Edge e: out[polled.v]){
                if(!visited[e.v]) pq.add(new Edge(e.v, e.w + polled.w));
            }
            for(Edge e: in[polled.v]){
                if(!visited[e.v]) pq.add(new Edge(e.v, 2*e.w+polled.w));
            }
        }
        return -1;
    }
}