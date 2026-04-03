class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> seen = new HashSet<>();
        int common = 0;
        for(int i =0; i< A.length; i++){
            if(!seen.add(A[i])){
                common++;
            }
            if(!seen.add(B[i])){
                common++;
            }
            A[i] = common;
        }
        return A;
    }
}