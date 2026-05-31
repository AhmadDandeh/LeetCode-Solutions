class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currentMass = mass;
        for(int num: asteroids){
            if(num>currentMass) return false;
            else currentMass += num;
        }
        return true;
    }
}