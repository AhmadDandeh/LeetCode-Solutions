class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int ones = 0, zeros = 0;
        for(int i=0; i<n; i++){
            if(students[i] == 1) ones++;
            else zeros++;
        }

        for(int i=0; i<n; i++){
            if(sandwiches[i] == 1){
                if(--ones<0) return zeros;
            }
            else{
                if(--zeros<0) return ones;
            }
        }
        return 0;
    }

    /* With Queue Technique
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayDeque<Integer> queue = new ArrayDeque<>(students.length);
        for(int s: students){
            queue.addLast(s);
        }

        for(int i =0; i<sandwiches.length; i++){
            int cap = queue.size();
            while(queue.peekFirst() != sandwiches[i]){
                queue.addLast(queue.removeFirst());
                cap--;
                if(cap == 0) return queue.size();
            }
            queue.removeFirst();
        }
        return 0;
    }
    */
}