class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int a : arr) sum += a;
        if (sum % 3 != 0) return false;
        int target = sum / 3;
        int count = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            currentSum += arr[i];
            if (currentSum == target) {
                count++;
                currentSum = 0;
                if (count == 2) return true;
            }
        }
        return false;
    }
}