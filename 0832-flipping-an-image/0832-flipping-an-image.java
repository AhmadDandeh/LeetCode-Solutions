class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int left = 0;
        int right = image.length-1;

        while(left <= right){
            for(int i =0; i< image[0].length; i++){
                if(image[i][left] == image[i][right]){
                    image[i][left] ^= 1;
                    if(left != right) image[i][right] ^= 1;
                }
            }
            left++;
            right--;
        }
        return image;
    }
}