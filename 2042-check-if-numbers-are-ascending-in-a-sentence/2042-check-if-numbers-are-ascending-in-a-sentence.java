class Solution {
    public boolean areNumbersAscending(String s) {
        String[] splits = s.split(" ");
        int prev = 0, curr = 0;
        for(String ss: splits){
            char c = ss.charAt(0);
            if(c>='0' && c<='9'){
                prev = curr;
                curr = Integer.parseInt(ss);
                if(curr<=prev) return false;
            }
        }
        return true;
    }
}