class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum =0;
        for(int i=0; i<nums.size(); i++){
            if( k == Integer.bitCount(i)){
                sum += nums.get(i);
            }
        }
        return sum;
    }
}