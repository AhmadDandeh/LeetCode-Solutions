class Solution {
    public boolean sumGame(String num) {
        int n = num.length() / 2;
        int sumDiff = 0;
        int qDiff = 0;

        for (int i = 0; i < n; i++) {
            char c1 = num.charAt(i);
            char c2 = num.charAt(i + n);

            if (c1 == '?') qDiff++;
            else sumDiff += c1 - '0';

            if (c2 == '?') qDiff--;
            else sumDiff -= c2 - '0';
        }

        if ((qDiff % 2 != 0)) {
            return true;
        }
        return sumDiff + (qDiff / 2) * 9 != 0;
    }
}