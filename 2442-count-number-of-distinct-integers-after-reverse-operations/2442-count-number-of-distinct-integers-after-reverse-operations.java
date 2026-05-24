class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> distinctNumbers = new HashSet<>();
        for (int num : nums) {
            distinctNumbers.add(num);
            distinctNumbers.add(reverse(num));
        }
        return distinctNumbers.size();
    }

    private int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}