class Solution {
    record Data(int occ, int first, int last){}
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Data> map = new HashMap<>();
        int maxO = 0;
        int minLength = nums.length;
        for (int i = 0; i < nums.length; i++) {
            Data old = map.get(nums[i]);
            Data current;
            if (old == null) current = new Data(1, i, i);
            else current = new Data(old.occ + 1, old.first, i);
            map.put(nums[i], current);

            int length = current.last - current.first + 1;
            if (current.occ > maxO) {
                maxO = current.occ;
                minLength = length;
            } 
            else if (current.occ == maxO) minLength = Math.min(minLength, length);
        }
        return minLength;
    }
}