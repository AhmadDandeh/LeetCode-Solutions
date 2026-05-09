class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        for(int card: cardPoints) sum += card;

        if(n == k) return sum;

        int min = 0, window = 0;
        int windowSize = n-k;
        for(int i=0; i<windowSize;i++){
            window += cardPoints[i];
        }
        min = window;

        for(int i=windowSize; i<cardPoints.length; i++){
            window += cardPoints[i] - cardPoints[i - windowSize];
            min = Math.min(min, window);
        }

        return sum - min;
    }
}