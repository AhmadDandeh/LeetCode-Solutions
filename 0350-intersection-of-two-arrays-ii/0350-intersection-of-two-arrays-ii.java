class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[][] map = new int[2][1001];
        for(int num:nums1) map[0][num]++;
        int n = 0;
        for(int num:nums2){
            if(map[0][num]>0){
                map[0][num]--;
                map[1][num]++;
                n++;
            }
        }
        int[] ans = new int[n];
        int j = 0;
        for(int i =0; i<=1000; i++){
            while(map[1][i]-->0){
                ans[j++] = i;
            }
        }
        return ans;
    }
}