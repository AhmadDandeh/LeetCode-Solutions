class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];

        Map<Integer, Long> count = new HashMap<>();
        Map<Integer, Long> sum = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = nums[i];

            long c = count.getOrDefault(x, 0L);
            long s = sum.getOrDefault(x, 0L);

            ans[i] = c * i - s;

            count.put(x, c + 1);
            sum.put(x, s + i);
        }

        count.clear();
        sum.clear();

        for (int i = n - 1; i >= 0; i--) {
            int x = nums[i];

            long c = count.getOrDefault(x, 0L);
            long s = sum.getOrDefault(x, 0L);

            ans[i] += s - c * i;

            count.put(x, c + 1);
            sum.put(x, s + i);
        }

        return ans;
    }
}