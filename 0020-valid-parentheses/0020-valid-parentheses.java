class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
    	for(int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if(c == '{' || c == '[' || c == '(') {
				stack.push(c);
			}
			else {
                if(stack.isEmpty()){
                    return false;
                }
				char x = stack.pop();
				if(!((x == '{' && c == '}') || (x == '[' && c == ']') || (x == '(' && c == ')'))){
					return false;
				}
			}
		}
    	return stack.isEmpty();
    }
}