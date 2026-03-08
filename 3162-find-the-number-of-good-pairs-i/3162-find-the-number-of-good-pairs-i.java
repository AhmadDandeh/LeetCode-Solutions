class Solution {
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
}