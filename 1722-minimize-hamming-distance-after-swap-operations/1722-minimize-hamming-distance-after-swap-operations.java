class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        DSU dsu = new DSU(n);

        for(int i = 0; i<allowedSwaps.length; i++) dsu.union(allowedSwaps[i][0], allowedSwaps[i][1]);
        int ans = 0;
        for(List<Integer> list: dsu.getAllComponent()){
            Map<Integer, Integer> freq = new HashMap<>();
            for(int index: list){
                int s = source[index];
                int t = target[index];
                // freq[s]++
                freq.put(s, freq.getOrDefault(s, 0) + 1);
                // freq[t]--
                freq.put(t, freq.getOrDefault(t, 0) - 1);
            }
            
            for (int val : freq.values()) {
                if (val > 0) ans += val;
            }
        }
        return ans;
    }

    class DSU{
        int[] parent;

        DSU(int n){
            parent = new int[n];
            for(int i = 0; i < n; i++){
                parent[i] = i;
            }
        }

        public int find(int x){
            if(parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }

        public void union(int a, int b){
            int x1 = find(a);
            int x2 = find(b);
            if(x1 == x2) return;
            else if(x1 < x2) parent[x2] = x1;
            else parent[x1] = x2;
        }

        public List<List<Integer>> getAllComponent(){
            Map<Integer, List<Integer>> map = new HashMap<>();
            for(int i = 0; i < parent.length; i++){
                int group = find(i);
                map.computeIfAbsent(group, k -> new ArrayList<>()).add(i);
            }
            return new ArrayList<>(map.values());
        }
    }
}