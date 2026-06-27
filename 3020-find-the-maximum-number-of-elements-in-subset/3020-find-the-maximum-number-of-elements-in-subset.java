class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums) map.put(n, map.getOrDefault(n,0)+1);
        int max = 1;
        if(map.containsKey(1)){
            int c = map.get(1);
            max = Math.max(max, c%2 == 1? c:c-1);
        }
        map.remove(1);
        
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            int count = 1;
            int p = e.getKey();
            int r = (int) Math.sqrt(p);
            if(r*r != p) continue;
            while(map.containsKey(r) && map.get(r) > 1){
                count += 2;
                p = r;
                r = (int) Math.sqrt(p);
                if(r*r != p) break;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}