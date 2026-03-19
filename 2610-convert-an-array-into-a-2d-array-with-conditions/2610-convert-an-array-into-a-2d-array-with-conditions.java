class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            int count = map.getOrDefault(num, 0);
            if(count >= ans.size()){
                ans.add(new ArrayList<>());
            }
            ans.get(count).add(num);
            map.put(num, count+1);
        }
        return ans;
    }
}