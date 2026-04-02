class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        final long INF = (long) 1e18;
        long[][] dist = new long[26][26];

        for (int i = 0; i < 26; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int i = 0; i < original.length; i++) {
            int u = original[i] - 'a';
            int v = changed[i] - 'a';
            dist[u][v] = Math.min(dist[u][v], cost[i]);
        }

        // Floyd–Warshall
        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < source.length(); i++) {
            int s = source.charAt(i) - 'a';
            int t = target.charAt(i) - 'a';
            if (dist[s][t] == INF) return -1;
            ans += dist[s][t];
        }
        return ans;
    }
    /**
    * Dijkstra is correct, but for this problem we use Floyd–Warshall,
    * because Alphabet size is fixed and tiny,
    * Dijkstra --------> Time: O(original.length + source.length) = O(n) --------- Space: O(E)
    * Floyd–Warshall --> Time: O(original.length + 26³ + source.length) = O(n) --- Space: O(1)
    */
    
    /* 
    record Pair(char s, char t){}
    record NodeCost(char s, Long l){}
    HashMap<Pair, Integer> all;
    HashMap<Character, Set<Character>> lists = new HashMap<>(26);
    HashMap<Pair, Long> map = new HashMap<>();
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long ans = 0;
        all = new HashMap<>();
        int n = original.length;
        for(int i =0; i<n; i++){
            char s = original[i];
            char t = changed[i];
            lists.computeIfAbsent(s, k -> new HashSet<>()).add(t);
            Pair p = new Pair(s,t);
            all.put(p, Math.min(all.getOrDefault(p, Integer.MAX_VALUE), cost[i]));
        }
        
        n = source.length();
        for(int i =0; i<n; i++){
            char s = source.charAt(i);
            char t = target.charAt(i);
            Pair p = new Pair(s,t);
            if(map.containsKey(p)){
                ans += map.get(p);
                continue;
            }
            long charCost = SP(s, t);
            if(charCost == -1) return -1;
            ans += charCost;
            map.put(p, charCost);
        }
        return ans;
    }

    private long SP(char s, char t){
        boolean[] visited = new boolean[26];
        PriorityQueue<NodeCost> pq = new PriorityQueue<>(Comparator.comparingLong(p -> p.l));
        pq.add(new NodeCost(s,0L));
        while(!pq.isEmpty()){
            NodeCost polled = pq.poll();
            int index = polled.s - 'a';
            if (visited[index]) continue;
            visited[index] = true;
            if(polled.s == t) return polled.l;

            if(!lists.containsKey(polled.s)) continue;
            for(char c :lists.get(polled.s)){
                pq.add(new NodeCost(c, polled.l + all.get(new Pair(polled.s, c))));
            }
        }
        return -1;
    }*/
}