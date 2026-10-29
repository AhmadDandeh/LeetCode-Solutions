class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;
        int len = flowerbed.length;
        if(len == 0) return false;
        if(len == 1 && flowerbed[0] == 0) return n == 1;
        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            n--;
        }
        if(n == 0) return true;
        if(flowerbed[len-1] == 0 && flowerbed[len-2] == 0){
            flowerbed[len-1] = 1;
            n--;
        }
        if(n == 0) return true;
        for(int i =1; i<len-1 & n>0; i++){
            if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        return n == 0;
    }
}