class Solution {
    record Data(int h, int i){}

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        ArrayDeque<Data> stack = new ArrayDeque<>(n);
        int ans = 0;
        for(int i =0; i<n; i++){
            int lastStart = i;
            while(!stack.isEmpty() && stack.peekLast().h > heights[i]){
                ans = Math.max(ans, stack.peekLast().h * (i - stack.peekLast().i));
                lastStart = stack.peekLast().i;
                stack.removeLast();
            }
            stack.addLast(new Data(heights[i], lastStart));
        }
        while(!stack.isEmpty()){
            ans = Math.max(ans, stack.peekLast().h * (n - stack.peekLast().i));
            stack.removeLast();
        }

        return ans;
    }
}