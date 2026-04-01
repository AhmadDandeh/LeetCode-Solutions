class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int[] extended = new int[2 * n];

        for (int i = 0; i < n; i++) {
            extended[i] = extended[i+n] = colors[i];
        }

        int count = 0;
        int validLength = 1;

        for (int i = 1; i < 2 * n; i++) {
            if (extended[i] != extended[i - 1]) {
                validLength++;
            } else {
                validLength = 1;
            }

            if (validLength >= k) {
                if (i - k + 1 < n) {
                    count++;
                }
            }
        }

        return count;
    }
}