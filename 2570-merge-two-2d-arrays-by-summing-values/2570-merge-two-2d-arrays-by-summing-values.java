class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int a1 =0, a2 =0;
        int n1 = nums1.length, n2 = nums2.length;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        while(a1<n1 || a2<n2){
            if(a1 == n1){
                map.put(nums2[a2][0],nums2[a2][1]);
                a2++;
            }
            else if(a2 == n2){
                map.put(nums1[a1][0], nums1[a1][1]);
                a1++;
            }
            else{
                if(nums1[a1][0] == nums2[a2][0]){
                    map.put(nums1[a1][0], nums2[a2][1]+nums1[a1][1]);
                    a1++;
                    a2++;
                }
                else if(nums1[a1][0] > nums2[a2][0]){
                    map.put(nums2[a2][0], nums2[a2][1]);
                    a2++;
                }
                else{
                    map.put(nums1[a1][0], nums1[a1][1]);
                    a1++;
                }
            }
        }

        int[][] ans = new int[map.size()][2];
        int i =0;
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            ans[i][0] = m.getKey();
            ans[i][1] = m.getValue();
            i++;
        }
        return ans;
    }
}