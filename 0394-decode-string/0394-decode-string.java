class Solution {
    public String decodeString(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ']'){
                Deque<Character> rep = new ArrayDeque<>();
                while(stack.peekLast() != '['){
                    rep.addFirst(stack.removeLast());
                }
                stack.removeLast();
                int count = 0;
                int multiplier = 1;
                while(!stack.isEmpty() && stack.peekLast() <= '9' && stack.peekLast() >= '0'){
                    count += multiplier * (stack.removeLast() - '0');
                    multiplier *= 10;
                }
                while(count>0){
                    int size = rep.size();
                    while(size>0){
                        stack.addLast(rep.peekFirst());
                        rep.addLast(rep.removeFirst());
                        size--;
                    }
                    count--;
                }
            }
            else stack.addLast(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.removeFirst());
        }
        return sb.toString();
    }
}