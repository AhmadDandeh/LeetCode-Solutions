class Solution {
    public int findSpecialInteger(int[] arr) {
        // we can solve it in another way, with binary search
        int lower = (int) arr.length/4;
        for(int i = 0; i+lower<arr.length; i++){
            if(arr[i] == arr[i+lower]) return arr[i];
        }
        return -1;
    }
}