class Solution {
    public int maxArea(int[] height) {
        int left =0, right = height.length-1, size =0;;

        while(left<right){
            size = Math.max(size, (right-left) * Math.min(height[left], height[right]));
            if(height[right]>height[left]) left++;
            else right--;
        }
        return size;
    }
}