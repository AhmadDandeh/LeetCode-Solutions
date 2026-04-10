class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.computeIfAbsent(nums[i], ArrayList::new).add(i);
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if(entry.getValue().size() < 3) continue;
            for(int j = 2; j < entry.getValue().size(); j++){
                min = Math.min(min, 2 * (entry.getValue().get(j) - entry.getValue().get(j - 2)));
            }
        }
        return min ==  Integer.MAX_VALUE ? -1 : min;
    }
}