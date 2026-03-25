/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public static void findSecretWord(String[] words, Master master) {
        int matching = 0, n = words.length;
        boolean[] wordsB = new boolean[n]; // false initial and mean we can peek it, true we can not
        while(true){
            int[][] freq = new int[6][26];
            for(int i =0; i<n; i++){
                if(wordsB[i]) continue;
                for(int j =0; j<6; j++){
                    freq[j][words[i].charAt(j)-'a']++;
                }
            }
            
            int index = -1;
            int weight = Integer.MIN_VALUE;
            for(int i =0; i<n; i++){
                if(wordsB[i]) continue;
                int w = 0;
                for(int j =0; j<6; j++){
                    w += freq[j][words[i].charAt(j)-'a'];
                }
                if(w>weight){
                    index = i;
                    weight = w;
                }
            }
            
            matching = master.guess(words[index]);
            wordsB[index] = true;
            
            if(matching == 6) return;
            for (int i = 0; i < n; i++) {
                if (wordsB[i]) continue;
                int mm = getMatching(words[i], words[index]);
                if ((matching == 0 && mm > 0) || (matching > 0 && mm <matching)) {
                    wordsB[i] = true;
                }
            }
        }
    }

    public static int getMatching(String word1, String word2){
        int m = 0;
        for(int i =0; i<6; i++){
            if(word1.charAt(i) == word2.charAt(i)) m++;
        }
        return m;
    }
}