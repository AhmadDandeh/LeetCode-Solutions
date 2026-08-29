class Solution {
class DSU {
        private int[] parent;

        public DSU(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int i) {
            if (parent[i] == i) return i;
            return parent[i] = find(parent[i]);
        }

        public void union(int i, int j) {
            int rootI = find(i);
            int rootJ = find(j);
            if (rootI != rootJ) {
                parent[rootI] = rootJ;
            }
        }
    }

    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;

        int[][] valIdx = new int[n][2];
        for (int i = 0; i < n; i++) {
            valIdx[i][0] = nums[i];
            valIdx[i][1] = i;
        }
        Arrays.sort(valIdx, (a, b) -> Integer.compare(a[0], b[0]));

        DSU dsu = new DSU(n);
        for (int i = 1; i < n; i++) {
            if (valIdx[i][0] - valIdx[i - 1][0] <= limit) {
                dsu.union(valIdx[i][1], valIdx[i - 1][1]);
            }
        }

        Map<Integer, PriorityQueue<Integer>> groupValues = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = dsu.find(i);
            groupValues.computeIfAbsent(root, k -> new PriorityQueue<>()).add(nums[i]);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int root = dsu.find(i);
            result[i] = groupValues.get(root).poll();
        }

        return result;
    }
}