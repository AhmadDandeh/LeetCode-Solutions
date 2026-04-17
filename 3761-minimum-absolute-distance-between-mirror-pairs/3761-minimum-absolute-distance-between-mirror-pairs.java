class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>(n);
        int min = n;
        for(int i =0; i<n; i++){
            if(map.containsKey(nums[i])) min = Math.min(min, i - map.get(nums[i]));
            map.put(reverse(nums[i]), i);
        }
        return min == n? -1: min;
    }

    public int reverse(int x){
        int ans = 0;
        while(x>0){
            ans = (ans*10) + (x%10);
            x /= 10;
        }
        return ans;
    }
}