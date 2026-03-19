class Solution {
    public char kthCharacter(long k, int[] operations) {
        long length = 1;
        int index = -1;
        for(int o: operations){
            index++;
            length *= 2;
            if(length>=k) break;
        }

        int shifts = 0;
        while(index> -1){
            length /= 2;
            if(k>length){
                k -= length;
                if(operations[index] == 1) shifts++;
            }
            index--;
        }
        return (char) ('a' + (shifts%26));
    }
}