class Solution {
    public String reverseStr(String s, int k) {
        if(k<2) return s;
        char[] chars = s.toCharArray();
        int n = s.length();
        int left, right;

        for(int i =0; i<n; i += 2*k){
            left = i;
            right = Math.min(i+k-1, n-1);
            while(left<right){
                char c = chars[left];
                chars[left++] = chars[right];
                chars[right--] = c;
            }
        }
        
        return new String(chars);
    }
}