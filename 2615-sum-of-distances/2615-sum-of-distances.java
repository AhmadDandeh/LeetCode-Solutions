class Solution {
    public long[] distance(int[] nums) {
        long[] ans = new long[nums.length];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashMap<Integer, Long> sum = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
            sum.merge(nums[i], (long) i, Long::sum);
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> indices = entry.getValue();

            long totalSum = sum.get(entry.getKey());
            long prefixSum = 0;
            int size = indices.size();

            for (int j = 0; j < size; j++) {
                int index = indices.get(j);
                long left = (long) j * index - prefixSum;
                long right = (totalSum - prefixSum - index) - (long) (size - j - 1) * index;
                ans[index] = left + right;
                prefixSum += index;
            }
        }
        return ans;
    }
}