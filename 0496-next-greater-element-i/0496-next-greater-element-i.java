class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[10001];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = nums2.length-1; i>=0; i--){
            while(!dq.isEmpty() && nums2[i] > dq.peekLast()) dq.removeLast();
            res[nums2[i]] = dq.isEmpty()?-1:dq.peekLast();
            dq.addLast(nums2[i]);
        }
        for(int i =0; i<nums1.length; i++){
            nums1[i] =  res[nums1[i]];
        }
        return nums1;
    }
}