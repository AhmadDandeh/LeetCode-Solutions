class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if((num & 1) == 0){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int count = Integer.MIN_VALUE;
        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
			int val = entry.getValue();
            if(val > count || (val == count && ans > key)){
                count = val;
                ans = key;
            }
		}
        return ans;
    }
}