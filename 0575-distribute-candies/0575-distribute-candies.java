class Solution {
    public int distributeCandies(int[] candyType) {
        int limit = candyType.length / 2;
        HashSet<Integer> set = new HashSet<>(limit+1000);
        for(int c: candyType){
            set.add(c);
            if(set.size() == limit) return limit;
        }
        return set.size();
    }
}