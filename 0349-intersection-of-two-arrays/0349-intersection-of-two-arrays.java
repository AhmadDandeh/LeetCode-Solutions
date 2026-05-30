class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] b1 = new boolean[1001];
        for(int num:nums1) b1[num] = true;
        boolean[] b2 = new boolean[1001];
        int size = 0;
        for(int num:nums2){
            if(b1[num] && !b2[num]){
                size++;
                b2[num] = true;
            }
        }
        int[] arr = new int[size];
        int j =0;
        for(int i=0; i<=1000; i++){
            if(b1[i] && b2[i]) arr[j++] = i;
        }
        
        return arr;
    }
}