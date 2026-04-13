class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> dq = new LinkedList<>();
        for(int i =0; i<tokens.length; i++){
            if(tokens[i].length() == 1 && isOp(tokens[i].charAt(0))){
                dq.push(calc(tokens[i].charAt(0), dq.pop(), dq.pop()));
            }
            else{
                dq.push(Integer.parseInt(tokens[i]));
            }
        }
        return dq.pop();
    }

    private boolean isOp(char c){
        if(c == '+' || c == '-' || c == '*' || c == '/') return true;
        else return false;
    }

    private int calc(char op, int x2, int x1){
        if(op == '+') return x1+x2;
        else if(op == '-') return x1-x2;
        else if(op == '*') return x1*x2;
        else return (int) (x1/x2);
    }
}