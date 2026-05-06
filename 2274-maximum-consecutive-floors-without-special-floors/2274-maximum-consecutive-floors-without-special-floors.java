class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int maxFloors = 0;
        int n = special.length;
        maxFloors = Math.max(maxFloors, special[0] - bottom);
        for (int i = 1; i < n; i++) {
            maxFloors = Math.max(maxFloors, special[i] - special[i-1] - 1);
        }
        maxFloors = Math.max(maxFloors, top - special[n-1]);
        return maxFloors;
    }
}