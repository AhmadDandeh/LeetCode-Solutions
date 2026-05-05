class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int pointer = 0;
        int n1 = str1.length();
        int n2 = str2.length();
        if(n2>n1) return false;
        for(int i =0; i<n1 && pointer<n2; i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(pointer);
            char next = (c1 == 'z') ? 'a' : (char)(c1 + 1);
            if((c1 == c2) || (c2 == next)) pointer++;
        }
        return pointer == n2;
    }
}