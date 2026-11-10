class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, n1 = name.length(), n2 = typed.length();
        for (int j = 0; j < typed.length(); j++) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) i++;
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) return false;
        }
        return i == n1;
    }
}