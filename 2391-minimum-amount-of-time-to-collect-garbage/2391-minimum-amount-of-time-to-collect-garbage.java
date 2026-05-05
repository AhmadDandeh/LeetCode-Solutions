class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans = 0, mTime = 0, gTime = 0, pTime = 0;
        int currentTime = 0;

        for (int i = 0; i < garbage.length; i++) {
            //String s = garbage[i];
            ans += garbage[i].length();

            if (garbage[i].contains("M")) mTime = currentTime;
            if (garbage[i].contains("G")) gTime = currentTime;
            if (garbage[i].contains("P")) pTime = currentTime;

            if (i < travel.length) currentTime += travel[i];
        }

        return ans + mTime + gTime + pTime;
    }
}