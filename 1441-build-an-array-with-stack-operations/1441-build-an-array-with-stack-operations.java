class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new LinkedList<>();
        int nn = target.length;
        int j = 0;
        for(int i = 1; i<=n; i++){
            if(i == target[j]){
                ans.add("Push");
                j++;
                if(j == nn) break;
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}