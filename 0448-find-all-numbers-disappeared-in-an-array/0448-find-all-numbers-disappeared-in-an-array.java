class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums) set.add(n);
        List<Integer> ans = new LinkedList<>();
        for(int i =1; i<=nums.length; i++) if(!set.contains(i)) ans.add(i);
        return ans;
    }
}