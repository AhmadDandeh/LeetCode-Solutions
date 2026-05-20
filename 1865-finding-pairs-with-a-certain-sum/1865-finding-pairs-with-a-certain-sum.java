class FindSumPairs {
    int[] nums1, nums2;
    Map<Integer, Integer> map;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.map = new HashMap<>();
        for(int n: nums2){
            this.map.put(n, this.map.getOrDefault(n, 0)+1);
        }
    }
    
    public void add(int index, int val) {
        this.map.put(nums2[index], this.map.get(nums2[index])-1);
        if(this.map.get(nums2[index]) == 0) this.map.remove(nums2[index]);
        this.nums2[index] += val;
        this.map.put(nums2[index], this.map.getOrDefault(nums2[index], 0)+1);
    }
    
    public int count(int tot) {
        int count = 0;
        for(int n:nums1){
            int sub = tot - n;
            count += this.map.getOrDefault(sub, 0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */