class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int totalOnes = 0;
        for (int num : nums) {
            totalOnes += num;
        }
        int currentScore = totalOnes;
        int maxScore = currentScore;
        result.add(0);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) currentScore++;
            else currentScore--;
            
            int divisionIndex = i + 1;
            if (currentScore > maxScore) {
                maxScore = currentScore;
                result.clear();
                result.add(divisionIndex);
            } 
            else if (currentScore == maxScore) {
                result.add(divisionIndex);
            }
        }
        return result;
    }
}