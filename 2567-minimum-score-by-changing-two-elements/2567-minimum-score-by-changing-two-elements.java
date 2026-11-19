class Solution {
    public int minimizeSum(int[] nums) {
        int[] min = new int[3];
        int[] max = new int[3];
        Arrays.fill(min, Integer.MAX_VALUE);
        for(int num:nums){
            if(num<min[0]){
                min[2] = min[1];
                min[1] = min[0];
                min[0] = num;
            }
            else if(num<min[1]){
                min[2] = min[1];
                min[1] = num;
            }
            else if(num<min[2]) min[2] = num;

            if(num>max[0]){
                max[2] = max[1];
                max[1] = max[0];
                max[0] = num;
            }
            else if(num>max[1]){
                max[2] = max[1];
                max[1] = num;
            }
            else if(num>max[2]) max[2] = num;
        }
        return Math.min(
                    Math.min(max[0] - min[2], max[2] - min[0]),
                    max[1] - min[1]
                );
    }
}