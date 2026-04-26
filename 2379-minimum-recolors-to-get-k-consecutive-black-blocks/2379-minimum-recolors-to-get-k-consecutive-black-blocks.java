class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        for(int i =0; i<k; i++){
            if(blocks.charAt(i) == 'B'){
                count++;
            }
        }
        if(count == k){
            return 0;
        }

        int c = count;
        for(int i=k; i< blocks.length(); i++){
            if(blocks.charAt(i) == 'B'){
                c++;
            }
            if(blocks.charAt(i-k) == 'B'){
                c--;
            }
            if(c>count){
                count = c;
            }
        }

        return k-count;
    }
}