class Solution {
    public String interpret(String command) {
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<command.length(); i++){
            char c = command.charAt(i);
            if(c == 'G'){
                sb.append("G");
            }
            else{
                if(command.charAt(i+1) == 'a'){
                    sb.append("al");
                    i += 3;
                }
                else{
                    sb.append("o");
                    i++;
                }
            }
        }

        return sb.toString();
    }
}