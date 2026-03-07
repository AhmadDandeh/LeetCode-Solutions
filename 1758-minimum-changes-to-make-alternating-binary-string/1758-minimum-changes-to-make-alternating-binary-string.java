class Solution {
    public int minOperations(String s) {
        int startO = 0, startZ = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                if (s.charAt(i) == '0')
                    startO++;
                else
                    startZ++;
            } else {
                if (s.charAt(i) == '0')
                    startZ++;
                else
                    startO++;
            }
        }
        return Math.min(startO, startZ);
    }
}