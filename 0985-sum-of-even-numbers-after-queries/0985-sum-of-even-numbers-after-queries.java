class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] answer = new int[queries.length];
        int evenSum = 0;
        
        for (int num : nums) {
            if (num % 2 == 0) evenSum += num;
        }
        
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            
            if (nums[index] % 2 == 0) evenSum -= nums[index];
            
            nums[index] += val;
            
            if (nums[index] % 2 == 0) evenSum += nums[index];
            answer[i] = evenSum;
        }
        return answer;
    }
}