class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        while(left <= right){
            int i = left;
            while(i > 0){
                int j = i % 10;
                if(j == 0) break;
                if(left % j != 0) break;
                i /= 10;
            }
            if(i == 0) ans.add(left);
            left++;
        }
        return ans;
    }
}