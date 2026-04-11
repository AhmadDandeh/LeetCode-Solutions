class Solution {
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        ArrayDeque<String> dq = new ArrayDeque<>();
        for(String s: split){
            if(s.equals("") || s.equals(".")) continue;
            else if(s.equals("..")){
                if(!dq.isEmpty()){
                    dq.removeLast();
                }
            }
            else dq.addLast(s);
        }
        if(dq.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for (String dir : dq) sb.append('/').append(dir);
        return sb.toString();
    }
}