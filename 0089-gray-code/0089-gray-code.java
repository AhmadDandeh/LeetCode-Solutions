class Solution {
    public List<Integer> grayCode(int n) {
        int size = 1 << n;
        Integer[] ans = new Integer[size];
        ans[0] = 0;
        int pow = 1;
        while(pow < size){
            for(int i = 0; i<pow; i++){
                ans[pow+i] = ans[pow-i-1] + pow;
            }
            pow *= 2;
        }
        return Arrays.asList(ans);
    }
}