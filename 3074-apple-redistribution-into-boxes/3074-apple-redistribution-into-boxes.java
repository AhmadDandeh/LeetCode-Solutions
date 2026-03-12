class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0;
        for(int a: apple) sum += a;
        int ans = 0;
        int i = capacity.length-1;
        while(sum>0 && i>=0){
            ans++;
            sum -= capacity[i--];
        }
        return ans;
    }
}