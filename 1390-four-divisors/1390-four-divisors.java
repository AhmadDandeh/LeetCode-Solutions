class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> memo = new HashMap<>();

        for (int n : nums) {
            Integer cached = memo.get(n);
            if (cached != null) {
                ans += cached;
                continue;
            }

            int add = sumIfExactlyFourDivisors(n);
            memo.put(n, add);
            ans += add;
        }
        return ans;
    }

    private int sumIfExactlyFourDivisors(int n) {
        if (n < 6) return 0;

        int p = primeCubeRootIfAny(n);
        if (p != 0) {
            return 1 + p + p * p + n;
        }

        int d = smallestDivisor(n);
        if (d == 0) return 0;

        int other = n / d;
        if (d == other) return 0;

        if (isPrime(d) && isPrime(other)) {
            return 1 + d + other + n;
        }
        return 0;
    }

    private int primeCubeRootIfAny(int n) {
        int r = (int) Math.round(Math.cbrt(n));
        if (r >= 2 && r * r * r == n && isPrime(r)) return r;
        return 0;
    }

    private int smallestDivisor(int n) {
        if ((n & 1) == 0) return 2;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return i;
        }
        return 0;
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        if ((x & 1) == 0) return x == 2;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
}