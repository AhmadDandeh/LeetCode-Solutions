class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3) return false;
        if(arr[0] > arr[1]) return false;
        int i = 0;
        while(i < n-1 && arr[i+1] > arr[i]){
            i++;
        }
        if(i == n-1) return false;
        while(i < n-1 && arr[i+1] < arr[i]){
            i++;
        }
        return i == n-1;
    }
}