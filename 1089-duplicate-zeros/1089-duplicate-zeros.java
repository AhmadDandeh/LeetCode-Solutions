class Solution {
    public void duplicateZeros(int[] arr) {
        // first pass
        int count = 0, i = 0, n = arr.length;
        for(; count<n; i++){
            if(arr[i] == 0) count++;
            count++;
        }

        // second pass
        i--;
        if (count > n) {
            arr[n - 1] = 0;
            count = n - 2;
            i--;
        }
        else {
            count = n - 1;
        }
        
        for(; i>=0; i--){
            if(arr[i] == 0){
                arr[count--] = 0;
            }
            arr[count--] = arr[i];
        }
    }
}