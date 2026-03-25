class Solution {
    public String convertDateToBinary(String date) {
        String[] d = date.split("-");
        StringBuilder sb = new StringBuilder();
        for(String s:d){
            sb.append(Integer.toBinaryString(Integer.parseInt(s)));
            sb.append("-");
        }
        sb.deleteCharAt(sb.lastIndexOf("-"));
        return sb.toString();
    }
}