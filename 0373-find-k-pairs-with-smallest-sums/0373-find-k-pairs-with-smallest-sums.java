class Solution {
    record Tripple(int sum, int i, int j){}
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length, n2 = nums2.length;
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<Tripple> pq = new PriorityQueue<>(Comparator.comparingInt(Tripple::sum));
        int limit1 = Math.min(n1, k);
        for (int i = 0; i < limit1; i++) {
            pq.add(new Tripple(nums1[i] + nums2[0], i, 0));
        }
        while(k-->0){
            Tripple t = pq.poll();
            ans.add(List.of(nums1[t.i], nums2[t.j]));
            if (t.j + 1 < n2) pq.add(new Tripple(nums1[t.i] + nums2[t.j + 1], t.i, t.j + 1));
        }
        return ans;
    }
}