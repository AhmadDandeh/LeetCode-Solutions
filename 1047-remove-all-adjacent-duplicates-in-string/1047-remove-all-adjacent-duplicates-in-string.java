class Solution {
    public String removeDuplicates(String s) {
        // We can use the StringBuilder itself as a stack
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
            if(stack.isEmpty()) {
            	stack.addLast(c);
            }
            else {
            	if(stack.peekLast() == c) {
            		stack.removeLast();
            	}
            	else {
            		stack.addLast(c);
            	}
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
        	sb.append(stack.removeLast());
        }
        return sb.reverse().toString();

    }
}