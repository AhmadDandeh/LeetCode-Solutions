class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            map.computeIfAbsent(size, k -> new ArrayList<>()).add(i);

            if (map.get(size).size() == size) {
                ans.add(map.remove(size));  // no copy, just move the list
            }
        }
        return ans;
    }
}