class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i =0; i< operations.length; i++){
            if(operations[i].equals("+")){
                int last = stack.removeLast();
                int secondLast = stack.peekLast();
                int newScore = last + secondLast;
                
                // Put back the last element, then the new score
                stack.addLast(last);
                stack.addLast(newScore);
            }
            else if(operations[i].equals("C")){
                stack.removeLast();
            }
            else if(operations[i].equals("D")){
                stack.addLast(stack.peekLast()*2);
            }
            else{
                stack.addLast(Integer.parseInt(operations[i]));
            }
        }

        int ans = 0;
        while(!stack.isEmpty()){
            ans += stack.removeLast();
        }
        return ans;
    }
}