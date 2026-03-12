class Solution {
    private int[] parent;
    public int maxStability(int n, int[][] edges, int k) {
        Arrays.sort(edges, Comparator.comparingInt((int[] a) -> -a[3]).thenComparing(a -> -a[2]));
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int min = Integer.MAX_VALUE;
        int i =0;

        for(; i<edges.length; i++){
            if(edges[i][3] == 0) break;
            if(!union(edges[i][0], edges[i][1])) return -1;
            min = Math.min(min, edges[i][2]);
        }

        if(i == n-1) return min;
        List<Integer> list = new ArrayList<>(n-i);
        int remain = n-1-i;
        for(; i<edges.length; i++){
            if(!union(edges[i][0], edges[i][1])) continue;
            list.add(edges[i][2]);
            if(list.size() == remain){
                int developedMin = list.get(remain - 1) * 2;
    
                int undidMin = Integer.MAX_VALUE;
                if (remain > k) {
                    undidMin = list.get(remain - k - 1);
                }
            
                min = Math.min(min, Math.min(developedMin, undidMin));
                return min;
            }
        }
        return -1;
    }

    public int find(int i) {
        if (parent[i] == i) {
            return i;
        }
        return parent[i] = find(parent[i]);
    }

    public boolean union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);
        if (rootI != rootJ) {
            parent[rootI] = rootJ;
            return true;
        }
        return false;
    }
}