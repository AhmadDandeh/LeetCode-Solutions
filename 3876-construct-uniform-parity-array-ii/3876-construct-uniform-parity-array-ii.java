class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = 0, minO = Integer.MAX_VALUE, minE = Integer.MAX_VALUE;
        for(int num:nums1){
            if((num&1) == 1){
                odd++;
                minO = Math.min(minO, num);
            }
            else minE = Math.min(minE, num);
        }
        if(odd == nums1.length) return true;
        if(odd == 0) return true;
        return minE - minO > 0;
    }
}