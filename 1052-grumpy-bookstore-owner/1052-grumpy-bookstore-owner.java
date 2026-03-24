class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sat = 0; int nsat = 0;
        for(int i=0; i<minutes; i++){
            if((grumpy[i]&1) == 0){
                nsat += customers[i];
            }
            else{
                sat += customers[i];
            }
        }

        int maxNSat = nsat;
        for(int i=minutes; i<customers.length; i++){
            if((grumpy[i-minutes]&1) == 1){
                nsat -= customers[i-minutes];
            }
            if((grumpy[i]&1) == 0){
                sat += customers[i];
            }
            else{
                nsat += customers[i];
            }
            if(nsat>maxNSat) maxNSat = nsat;
        }
        return maxNSat + sat;
    }
}