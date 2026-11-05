class Solution {
    // Prefix Sum, optimal depends on the constraints
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int[] prefix = new int[2001];
        for (int b : arr2) prefix[b + 1000]++;
        for (int i = 1; i < 2001; i++) prefix[i] += prefix[i - 1];
        
        int ans = 0;
        for (int a : arr1) {
            int left = Math.max(-1000, a - d);
            int right = Math.min(1000, a + d);

            int count = prefix[right + 1000]
                      - (left == -1000 ? 0 : prefix[left + 999]);

            if (count == 0) ans++;
        }
        return ans;
    }

    /**
    // Sorting + Binary Search
    // O(n log(n)) time ans O(n) space
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        for(int a: arr1){
            int low = a-d;
            int high = a+d;
            int index = Arrays.binarySearch(arr2, low);
            if(index <0) index = -index -1;
            if(index == arr2.length || arr2[index] > high) ans++;
        }
        return ans;
    }
    */
}