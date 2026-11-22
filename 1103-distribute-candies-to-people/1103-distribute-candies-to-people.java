class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int k = (int) ((Math.sqrt(8L * candies + 1) - 1) / 2);

        int layer = k / num_people;
        int distributed = layer * num_people;

        candies -= (int) ((long) distributed * (distributed + 1) / 2);
        int[] ans = new int[num_people];
        int basic = num_people * layer * (layer - 1) / 2;
        for (int i = 0; i < num_people; i++) ans[i] = (i + 1) * layer + basic;

        for (int i = 0; candies > 0; i++) {
            int x = distributed + i + 1;
            int give = Math.min(candies, x);
            ans[i] += give;
            candies -= give;
        }
        return ans;
    }
}