class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n = nums.length;
        List<Boolean> li = new ArrayList<>(n);
        int x = 0;
        for(int num: nums){
            x = ((x<<1)|num)%5;
            li.add(x == 0);
        }
        return li;
    }
}