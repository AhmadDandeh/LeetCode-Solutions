class Solution {
    record Data(int l, int h){}
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Data, Integer> map = new HashMap<>();
        int ans = 0;
        for (int[] d : dominoes) {
            Data key = new Data(Math.min(d[0], d[1]), Math.max(d[0], d[1]));
            int count = map.getOrDefault(key, 0);
            ans += count;
            map.put(key, count + 1);
        }
        return ans;
    }
}