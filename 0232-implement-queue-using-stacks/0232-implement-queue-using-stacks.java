class MyQueue {
    ArrayDeque<Integer> stackIn;
    ArrayDeque<Integer> stackOut;
    
    public MyQueue() {
        stackIn = new ArrayDeque<>();
        stackOut = new ArrayDeque<>();
    }
    
    public void push(int x) {
        stackIn.push(x);
    }
    
    public int pop() {
        moveIfNeed();
        return stackOut.pop();
    }
    
    public int peek() {
        moveIfNeed();
        return stackOut.peek();
    }
    
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    private void moveIfNeed(){
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */