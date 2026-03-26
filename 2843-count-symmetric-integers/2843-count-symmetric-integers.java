class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int num = low; num <= high; num++) {
            if (isSymmetric(num)) count++;
        }
        return count;
    }

    private boolean isSymmetric(int num) {
        int digits = countDigits(num);
        if (digits % 2 != 0) return false; // Only even-digit numbers

        int[] d = new int[digits];
        int n = digits;
        int temp = num;
        
        // Extract digits from right to left
        while (temp > 0) {
            d[--n] = temp % 10;
            temp /= 10;
        }

        int mid = digits / 2;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < mid; i++) {
            leftSum += d[i];
            rightSum += d[i + mid];
        }

        return leftSum == rightSum;
    }

    private int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}