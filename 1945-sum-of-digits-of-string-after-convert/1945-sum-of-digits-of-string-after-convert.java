class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for (char c : s.toCharArray()) {
            int val = c - 'a' + 1;
            num.append(val);
        }

        String str = num.toString();
        while (k-- > 0) {
            int sum = 0;
            for (char digit : str.toCharArray()) {
                sum += digit - '0';
            }
            str = Integer.toString(sum);
        }

        return Integer.parseInt(str);
    }
}