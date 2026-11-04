class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0, tens = 0;
        for(int b: bills){
            if(b == 5){
                fives++;
            }
            else if(b ==10){
                tens++;
                if(fives > 0) fives--;
                else return false;
            }
            else{
                if(fives > 0 && tens > 0){
                    fives--;
                    tens--;
                }
                else if(fives > 2) fives -=3;
                else return false;
            }
        }
        return true;
    }
}