class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        HashSet<Integer> setB = new HashSet<>();
        int sumA = 0;
        int sumB = 0;
        for (int a : aliceSizes) sumA += a;
        for (int b : bobSizes) {
            sumB += b;
            setB.add(b);
        }

        int diff = (sumA - sumB) / 2;
        for (int a : aliceSizes) {
            int b = a - diff;
            if (setB.contains(b)) {
                return new int[]{a, b};
            }
        }
        return new int[0];
    }
}