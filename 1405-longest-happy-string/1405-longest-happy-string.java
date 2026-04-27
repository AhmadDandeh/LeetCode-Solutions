class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Integer[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> -o[1]));
        if(a>0) pq.add(new Integer[]{0, a});
        if(b>0) pq.add(new Integer[]{1, b});
        if(c>0) pq.add(new Integer[]{2, c});
        char[] chars = new char[]{'a', 'b', 'c'};

        StringBuilder sb = new StringBuilder();
        int last = -1;
        while(!pq.isEmpty()){
            Integer[] top = pq.remove();
            if(top[1]>1){
                if(last != top[0]){
                    sb.append(chars[top[0]]);
                    sb.append(chars[top[0]]);
                    top[1] -= 2;
                    if(!pq.isEmpty()){
                        Integer[] next = pq.remove();
                        sb.append(chars[next[0]]);
                        next[1]--;
                        if(top[1] != 0) pq.add(top);
                        if(next[1] != 0) pq.add(next);
                        last = next[0];
                    }
                    else break;
                }
                else{
                    sb.append(chars[top[0]]);
                    top[1]--;
                    if(!pq.isEmpty()){
                        Integer[] next = pq.remove();
                        sb.append(chars[next[0]]);
                        next[1]--;
                        if(top[1] != 0) pq.add(top);
                        if(next[1] != 0) pq.add(next);
                        last = next[0];
                    }
                    else break;
                }
            }
            else{
                sb.append(chars[top[0]]);
                while(!pq.isEmpty()) sb.append(chars[pq.remove()[0]]);
            }
        }
        return sb.toString();
    }
}