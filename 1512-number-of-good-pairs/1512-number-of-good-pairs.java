class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums) map.put(num, map.getOrDefault(num, 0)+1);
        int ans = 0;
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            int n = m.getValue();
            if(n>1) ans += n*(n-1) /2;
        }
        return ans;
    }
}