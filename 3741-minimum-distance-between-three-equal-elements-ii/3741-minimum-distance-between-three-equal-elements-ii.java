class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        Map<Integer, int[]> lastIndices = new HashMap<>();
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int val = nums[i];
            
            if (!lastIndices.containsKey(val)) {
                lastIndices.put(val, new int[]{i, -1});
            } else {
                int[] indices = lastIndices.get(val);
                int prev1 = indices[0];
                int prev2 = indices[1];

                if (prev2 != -1) {
                    minDiff = Math.min(minDiff, i - prev2);
                }

                indices[1] = prev1;
                indices[0] = i;
            }
        }

        return (minDiff == Integer.MAX_VALUE) ? -1 : 2 * minDiff;
    }
}