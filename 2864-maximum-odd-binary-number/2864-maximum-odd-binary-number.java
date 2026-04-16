class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int zeros = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') ones++;
            else zeros++;
        }

        StringBuilder sb = new StringBuilder();

        // Add count - 1 ones at the front
        for (int i = 0; i < ones - 1; i++) {
            sb.append('1');
        }

        // Add all zeros
        for (int i = 0; i < zeros; i++) {
            sb.append('0');
        }

        // Add final 1 at the end to make it odd
        sb.append('1');

        return sb.toString();
    }
}