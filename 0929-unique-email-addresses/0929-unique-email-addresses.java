class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String e: emails){
            StringBuilder sb = new StringBuilder();
            boolean domain = false;
            boolean ignore = false;
            for(int i=0; i<e.length(); i++){
                char c = e.charAt(i);
                if(domain) sb.append(c);
                else if(c == '@'){
                    sb.append(c);
                    domain = true;
                }
                else if(ignore) continue;
                else if(c == '+') ignore = true;
                else if(c == '.') continue;
                else sb.append(c);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}