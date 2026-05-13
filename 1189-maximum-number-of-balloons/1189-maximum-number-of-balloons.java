class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[5];
        for(char c: text.toCharArray()){
            switch(c){
                case 'a': count[0]++; break;
                case 'b': count[1]++; break;
                case 'l': count[2]++; break;
                case 'n': count[3]++; break;
                case 'o': count[4]++; break;
            }
        }
        count[2] /= 2;
        count[4] /= 2;
        int min = count[0];
        for(int i = 1; i<5; i++){
            min = Math.min(min, count[i]);
        }
        return min;
    }
}