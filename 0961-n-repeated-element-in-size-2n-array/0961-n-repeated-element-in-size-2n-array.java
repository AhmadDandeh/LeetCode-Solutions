class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            if(!set.add(n)) return n;
        }
        return 0;
    }
}