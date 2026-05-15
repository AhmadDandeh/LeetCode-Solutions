class Solution {
    public String sortVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(
            Arrays.asList(new Character[]{'a','e','i','o','u','A','E','I','O','U'})
            );

        List<Character> list = new ArrayList<>();
        for(char c: s.toCharArray()){
            if(vowels.contains(c)) list.add(c);
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(char c: s.toCharArray()){
            if(vowels.contains(c)){
                sb.append(list.get(index++));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}