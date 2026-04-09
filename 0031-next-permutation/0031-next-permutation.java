class Solution {
    public void nextPermutation(int[] nums) {
        int i =nums.length-2;
        while(i>-1) {
        	if(nums[i]<nums[i+1]) {
        		break;
        	}
        	i--;
        }
        if(i == -1) {
        	// reverse the array
        	int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }
        else {
        	// find smallest number after i and bigger than nums[i]
        	int minIndex = i+1;
        	for(int j =i+2; j<nums.length;j++) {
        		if(nums[j]<=nums[minIndex] && nums[j]>nums[i]) {
        			minIndex = j;
        		}
        	}
        	
        	// swap i and smallest number
        	int temp1 = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp1;
            
         // reverse the array from i+1
        	int left = i+1;
            int right = nums.length - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        	
        }
    }
}