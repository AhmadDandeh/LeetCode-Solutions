class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n1 = a.length(), n2 = b.length();
        if(n2 == 0) return 0;
        
        int count = (n2 + n1 - 1) / n1; 
    
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(a);
        }
        
        if (sb.indexOf(b) != -1) return count;
        
        sb.append(a);
        if (sb.indexOf(b) != -1) return count + 1;
        
        return -1;
    }
}