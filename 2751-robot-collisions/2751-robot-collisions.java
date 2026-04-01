class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indices = IntStream.range(0, n)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(indices, Comparator.comparingInt(i -> positions[i]));

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            int index = indices[i];
            if(directions.charAt(index) == 'L'){
                while(!stack.isEmpty()){
                    if(healths[stack.peekLast()] == healths[index]){
                        healths[stack.removeLast()] = 0;
                        healths[index] = 0;
                        break;
                    }
                    else if(healths[stack.peekLast()] > healths[index]){
                        healths[stack.peekLast()]--;
                        healths[index] = 0;
                        break;
                    }
                    else{
                        healths[stack.removeLast()] = 0;
                        healths[index]--;
                    }
                }
            }
            else{
                stack.addLast(index);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) {
                result.add(healths[i]);
            }
        }
        return result;
    }
}