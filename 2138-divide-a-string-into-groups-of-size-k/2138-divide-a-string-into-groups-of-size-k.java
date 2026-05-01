class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int size = (n+k-1)/k;
        String[] ans = new String[size];
        StringBuilder sb = new StringBuilder();
        int count = 0, index = 0;
        for(char c: s.toCharArray()){
            sb.append(c);
            count++;
            if(count == k){
                count = 0;
                ans[index++] = sb.toString();
                sb.setLength(0);
            }
        }
        if(index<size){
            while(count<k){
                sb.append(fill);
                count++;
            }
            ans[index] = sb.toString();
        }
        return ans;
    }
}