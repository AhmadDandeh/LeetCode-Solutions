class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        HashSet<Integer> set = new HashSet<>();
        set.add(m-1);
        for(int i=0; i<hFences.length; i++){
            set.add(hFences[i]-1);
            set.add(m-hFences[i]);
            for(int j =i+1; j<hFences.length; j++){
                set.add(Math.abs(hFences[j]-hFences[i]));
            }
        }
        long max  = 0;
        if(set.contains(n-1)){
            max = n-1;
        }
        else{
            for(int i=0; i<vFences.length; i++){
                if(set.contains(vFences[i]-1)) max = Math.max(max, vFences[i]-1);
                if(set.contains(n-vFences[i])) max = Math.max(max, n-vFences[i]);
                for(int j =i+1; j<vFences.length; j++){
                    int diff = Math.abs(vFences[j]-vFences[i]);
                    if(set.contains(diff)) max = Math.max(max, diff);
                }
            }
            if(max == 0) return -1;
        }
        return (int) ((max*max)%1000000007);
    }
}