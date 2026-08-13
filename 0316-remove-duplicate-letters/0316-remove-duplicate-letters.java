class Solution {
    public String removeDuplicateLetters(String s) {
        int[] seen = new int[26];
        for (int i = 0; i < s.length(); i++) {
            seen[s.charAt(i) - 'a']++;
        }

        boolean[] inStack = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            seen[c - 'a']--;

            if (inStack[c - 'a']) continue;

            // Use StringBuilder directly as a Stack
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && seen[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                char removed = sb.charAt(sb.length() - 1);
                inStack[removed - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

            sb.append(c);
            inStack[c - 'a'] = true;
        }

        return sb.toString();
    }
}