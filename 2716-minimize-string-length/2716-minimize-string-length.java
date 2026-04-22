class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            seen.add(c);
        }
        return seen.size();
    }
}