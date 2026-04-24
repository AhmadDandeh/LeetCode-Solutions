class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int sL = s.length();
        DSU dsu = new DSU(sL);
        for(List<Integer> li: pairs) dsu.union(li.get(0), li.get(1));
        char[] chars = s.toCharArray();
        for(List<Integer> li: dsu.getAllComponents()){
            ArrayList<Character> c = new ArrayList<>();
            for(Integer l:li) c.add(chars[l]);
            Collections.sort(li);
            Collections.sort(c);
            for(int i =0; i<li.size(); i++) chars[li.get(i)] = c.get(i);
        }
        return new String(chars);
    }

    class DSU{
        int[] parent;

        DSU(int n){
            parent = new int[n];
            for(int i =0; i<n; i++) parent[i] = i;
        }

        public int find(int x){
            if(parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }

        public void union(int x, int y){
            int xp = find(x);
            int yp = find(y);
            if(xp == yp) return;
            else if(xp < yp) parent[yp] = xp;
            else parent[xp] = yp;
        }

        public List<List<Integer>> getAllComponents(){
            Map<Integer, List<Integer>> map = new HashMap<>();
            for(int i =0; i<parent.length; i++){
                int group = find(i);
                map.computeIfAbsent(group, k -> new ArrayList<>()).add(i);
            }
            return new ArrayList<>(map.values());
        }
    }
}