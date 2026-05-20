class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        stack.push(0);
        for (int n : nums) {
            while (stack.peek() > n) stack.pop();
            if (stack.peek() < n) {
                res++;
                stack.push(n);
            }
        }
        return res;
    }
}