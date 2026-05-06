class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int partL = part.length();
        char last = part.charAt(partL-1);

        for(char c: s.toCharArray()){
            sb.append(c);
            if(c == last && sb.length() >= partL){
                boolean match = true;
                for(int i=0; i<partL; i++){
                    if(part.charAt(i) != sb.charAt(sb.length() - partL +i)){
                        match = false;
                        break;
                    }
                }
                if(match) sb.setLength(sb.length()-partL);
            }
        }

        return sb.toString();
    }
}