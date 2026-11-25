class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] occ = new int[2001];
        for(int a:arr) occ[a+1001]++;
        HashSet<Integer> set = new HashSet<>();
        for(int o: occ){
            if(o != 0){
                if(!set.add(o)) return false;
            }
        }
        return true;
    }
}