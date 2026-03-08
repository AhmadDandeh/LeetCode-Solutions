class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length, index = 0;
        int[] freq = new int[1001];
        for(int i=0; i<n1; i++){
            freq[arr1[i]]++;
        }
        for(int a: arr2){
            while(freq[a]-->0) arr1[index++] = a;
        }

        for(int i=0; i<1001; i++){
            while(freq[i]-->0){
                arr1[index++] = i;
            }
        }
        return arr1;
    }
}