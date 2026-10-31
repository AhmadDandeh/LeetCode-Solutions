class Solution {
    public int openLock(String[] deadends, String target) {
        int t = Integer.parseInt(target);
        if (t == 0) return 0;
        
        HashSet<Integer> visited = new HashSet<>();
        for (String s : deadends) visited.add(Integer.parseInt(s));        
        if (visited.contains(0)) return -1;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited.add(0);
        
        int steps = 0;
        int[] pow10 = {1, 10, 100, 1000};
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                if (curr == t) return steps;
                
                for (int j = 0; j < 4; j++) {
                    int placeValue = pow10[j];
                    int digit = (curr / placeValue) % 10;
                    
                    for (int diff : new int[] {1, -1}) {
                        int nextDigit = (digit + diff + 10) % 10;
                        int next = curr + (nextDigit - digit) * placeValue;
                        
                        if (!visited.contains(next)) {
                            visited.add(next);
                            queue.offer(next);
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}