class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        String[] split = sentence.split(" ");
        int n = split.length - 1;
        for(int i=0; i<= n; i++){
            sb1.append('a');
            if("aeiouAEIOU".indexOf(split[i].charAt(0)) != -1) sb.append(split[i]);
            else{
                sb.append(split[i].substring(1));
                sb.append(split[i].charAt(0));
            }
            sb.append("ma");
            sb.append(sb1);
            if(i<n) sb.append(' ');
        }
        return sb.toString();
    }
}