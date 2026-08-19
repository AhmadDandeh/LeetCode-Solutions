class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] r:reservedSeats){
            if(r[1] == 1 || r[1] == 10) continue;
            else if(r[1] == 2 || r[1] == 3) map.put(r[0], map.getOrDefault(r[0], 0) | 1);
            else if(r[1] == 4 || r[1] == 5) map.put(r[0], map.getOrDefault(r[0], 0) | 2);
            else if(r[1] == 6 || r[1] == 7) map.put(r[0], map.getOrDefault(r[0], 0) | 4);
            else map.put(r[0], map.getOrDefault(r[0], 0) | 8);
        }

        int ans = n*2;
        for(Integer value : map.values()){
            if(value == 1 || value == 2 || value == 4 || value == 8 || value == 3 || value == 12 || value == 9) ans--;
            else ans -= 2;
        }
        return ans;
    }
}