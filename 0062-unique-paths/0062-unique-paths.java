class Solution {
    /** Combinatorics
        total steps to reach the bottom-right corner from the top-left corner is: m-1 + n-1 = m+n-2
        so, the combinatorics is "In how many ways can we choose the order of the "bottom" and "right" steps within the total number of steps", 
        which is (m+n-2)! / (m-1)! * (n-1)!
        (m+n-2)! / (m-1)! = (m+n-2)! / (m+n-2 - m-1)! = (m+n-2)! / (n-1)! "Symmetry Property"

        C(N, k): N = m+n-2 & k = Min(m-1, n-1)
        N! = N  * (N - 1) * (N - 2) ..... * (N - k + 1) * (N - k)!

        P = {N * (N - 1) * ... * (N - k + 1) * (N - k)! } /  {k! *(N - k)!} =>
        P = {N * (N - 1) * ... * (N - k + 1) } /  { k * k-1 * ... * 1 }
     */
     /*
    public int uniquePaths(int m, int n) {
        long result = 1;
        int N = m+n-2;
        int k = Math.min(m,n) - 1;
        for(int i = 1 ; i<=k; i++){
            result = result * (N - k + i) /i;
        }
        return (int) result;
    }*/

    /** Dynamic Programming - Grid Type
        Time: O(n*m)
        Space: O(n)
     */
     
    public int uniquePaths(int m, int n) {
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                arr[j] += arr[j-1];
            }
        }
        return arr[n-1];
    }
    
}