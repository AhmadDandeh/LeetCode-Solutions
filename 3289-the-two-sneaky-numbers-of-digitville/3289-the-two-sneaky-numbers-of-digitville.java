class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int i =0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num)) ans[i++] = num;
        }
        return ans;
    }
}