class Solution {
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int m = word.length();

        int[] dp = new int[n + 1];
        int answer = 0;

        for (int end = m; end <= n; end++) {
            int start = end - m;

            if (sequence.regionMatches(start, word, 0, m)) {
                dp[end] = dp[end - m] + 1;
                answer = Math.max(answer, dp[end]);
            }
        }

        return answer;
    }

}