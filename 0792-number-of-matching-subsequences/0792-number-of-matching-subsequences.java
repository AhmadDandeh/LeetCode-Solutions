class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        List<WordHead>[] buckets = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (String word : words) {
            buckets[word.charAt(0) - 'a'].add(new WordHead(word, 0));
        }
        
        int matchingCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int bucketIndex = c - 'a';
            
            List<WordHead> currentBucket = buckets[bucketIndex];
            buckets[bucketIndex] = new ArrayList<>();
            
            for (WordHead node : currentBucket) {
                node.index++;
                if (node.index == node.word.length()) {
                    matchingCount++;
                } 
                else {
                    int nextCharIndex = node.word.charAt(node.index) - 'a';
                    buckets[nextCharIndex].add(node);
                }
            }
        }
        
        return matchingCount;
    }

    private static class WordHead {
        String word;
        int index;
        
        WordHead(String word, int index) {
            this.word = word;
            this.index = index;
        }
    }
}