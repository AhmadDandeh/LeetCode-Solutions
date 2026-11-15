class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int n = nums.length;
        int m = nums[0].length();

        // mat[t] contains indices sorted by the last t digits.
        int[][] mat = new int[m + 1][n];

        for (int i = 0; i < n; i++) mat[0][i] = i;

        List<Integer>[] buckets = new ArrayList[10];

        for (int i = 0; i < 10; i++) buckets[i] = new ArrayList<>();

        // LSD radix sort: process digits from right to left.
        for (int trim = 1; trim <= m; trim++) {
            int digitIndex = m - trim;

            // Clear buckets before each digit pass.
            for (int d = 0; d < 10; d++) buckets[d].clear();

            // Preserve the ordering from the previous pass.
            for (int i = 0; i < n; i++) {
                int originalIndex = mat[trim - 1][i];
                int digit = nums[originalIndex].charAt(digitIndex) - '0';

                buckets[digit].add(originalIndex);
            }

            // Collect indices in ascending digit order.
            int pos = 0;

            for (int d = 0; d < 10; d++) {
                for (int originalIndex : buckets[d]) {
                    mat[trim][pos++] = originalIndex;
                }
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int k = queries[i][0];
            int trim = queries[i][1];

            ans[i] = mat[trim][k - 1];
        }

        return ans;
    }
}