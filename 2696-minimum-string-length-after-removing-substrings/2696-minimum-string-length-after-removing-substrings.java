class Solution {
    public int minLength(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty()){
                if(c == 'B' && stack.peekLast() == 'A'){
                    stack.removeLast();
                }
                else if(c == 'D' && stack.peekLast() == 'C'){
                    stack.removeLast();
                }
                else{
                    stack.addLast(c);
                }
            }
            else{
                stack.addLast(c);
            }
        }
        return stack.size();
    }
}