class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int forward = 0, backward = 0;
        int pointer = start;
        int n = distance.length;
        while(pointer != destination){
            forward += distance[pointer++];
            pointer %= n;
        }
        while(pointer != start){
            backward += distance[pointer++];
            pointer %= n;
        }
        return Math.min(forward, backward);
    }
}