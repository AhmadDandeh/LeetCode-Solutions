class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] count = new int[k];
        int isEmpty = 0;
        for(int a: arr){
            int mod = ((a % k) + k) % k;
            int dif = mod == 0? mod:k - mod;
            if(count[dif]> 0){
                count[dif]--;
                isEmpty--;
            }
            else{
                count[mod]++;
                isEmpty++;
            }
        }
        return isEmpty == 0;
    }
}