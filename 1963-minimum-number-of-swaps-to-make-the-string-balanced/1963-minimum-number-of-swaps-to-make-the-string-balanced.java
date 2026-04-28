class Solution {
    public int minSwaps(String s) {
        int ans =0, counter = 0, left =0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left) == '[') counter++;
            else counter--;
            
            while(counter<0){
                if(s.charAt(right) == '['){
                    ans++;
                    counter += 2;
                }
                right--;
            }
            left++;
        }
        return ans;
    }
}