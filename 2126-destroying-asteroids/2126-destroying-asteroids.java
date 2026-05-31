class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currentMass = mass;
        for(int i=0; i<asteroids.length; i++){
            if(asteroids[i]>currentMass) return false;
            else currentMass += asteroids[i];
        }
        return true;
    }
}