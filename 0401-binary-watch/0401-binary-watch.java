class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        if(turnedOn > 8) return ans;
        for(int h = 0; h<12; h++){
            int hB = Integer.bitCount(h);
            for(int m = 0; m<60; m++){
                int mB = Integer.bitCount(m);
                if(hB + mB == turnedOn){
                    ans.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return ans;
    }
}