class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) ++res;
            }
        }
        return res;
    }
    /*
    // Correct using Hashing but the Data set is too small
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums2) map.put(num, map.getOrDefault(num, 0)+1);

        int ans = 0;
        for(int num: nums1){
            if(num % k ==0){
                int b = num / k;
                int i = 1;
                for(; i*i < b; i++){
                    if(b % i == 0){
                        ans += map.getOrDefault(i, 0);
                        ans += map.getOrDefault(b/i, 0);
                    }
                }
                if(i * i == b) ans += map.getOrDefault(i, 0);
            }
        }
        return ans;
    }
    */
}