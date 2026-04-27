class CustomStack {
    private int capacity;
    private int[] stack;
    private int index = 0;

    public CustomStack(int maxSize) {
        capacity = maxSize;
        stack = new int[maxSize];
    }
    
    public void push(int x) {
        if(index < capacity) stack[index++] = x;
    }
    
    public int pop() {
        if(index > 0) return stack[--index];
        else return -1;
    }
    
    public void increment(int k, int val) {
        for(int i =0; i<k && i<index; i++){
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */