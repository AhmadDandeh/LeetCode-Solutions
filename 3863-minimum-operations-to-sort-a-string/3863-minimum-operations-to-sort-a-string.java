class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if(n <2) return 0;
        char first = s.charAt(0), end = s.charAt(n-1);
        if(n == 2) return first<=end? 0:-1;

        char min = 'z', max = 'a';
        char prev = 'a';
        boolean ordered = true;
        for(int i =1; i<n-1; i++){
            char c = s.charAt(i);
            if(c < min) min = c;
            if(c > max) max = c;
            if(c < prev) ordered = false;
            prev = c;
        }

        if(first <= min){
            if(end < max){
                if(end < first) return 2;
                else return 1;
            }
            else{
                if(ordered) return 0;
                else return 1;
            }
        }
        else{
            if(end < first){
                if(end < min){
                    if(first <= max) return 2;
                    else return 3;
                }
                else return 2;
            }
            else{
                if(end < max) return 2;
                else return 1;    
            }
        }
    }
}