class Solution {
    public int minMaxDifference(int num) {
        String numS = String.valueOf(num);
        int index = 0;
        while (index < numS.length() && numS.charAt(index) == '9') {
            index++;
        }
        if(index == numS.length()) return num;

        char minC = numS.charAt(0);
        char maxC = numS.charAt(index);
        
        int max = 0, min =0; 
        for(char c: numS.toCharArray()){
            min *= 10;
            max *= 10;
            if(c != minC) min += (int) (c - '0');
            
            if(c == maxC) max += 9;
            else max += (int) (c-'0');
        }
        return max - min;
    }
    /*
    // String Builder
    class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        
        StringBuilder maxSb = new StringBuilder(s);
        char targetMax = ' ';
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '9') {
                targetMax = s.charAt(i);
                break;
            }
        }
        if (targetMax != ' ') {
            for (int i = 0; i < n; i++) {
                if (maxSb.charAt(i) == targetMax) {
                    maxSb.setCharAt(i, '9');
                }
            }
        }

        StringBuilder minSb = new StringBuilder(s);
        char targetMin = s.charAt(0); // دائماً نغير أول رقم لضمان أصغر قيمة
        for (int i = 0; i < n; i++) {
            if (minSb.charAt(i) == targetMin) {
                minSb.setCharAt(i, '0');
            }
        }

        return Integer.parseInt(maxSb.toString()) - Integer.parseInt(minSb.toString());
    }
    */
}