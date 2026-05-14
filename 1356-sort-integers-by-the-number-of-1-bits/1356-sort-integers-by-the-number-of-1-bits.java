class Solution {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                     .boxed()
                     .sorted(Comparator.comparingInt(Integer::bitCount).thenComparing(Integer::intValue))
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}