class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // get the largest candies
    	int max = candies[0];
    	for(int i =1; i< candies.length;i++) {
    		if(candies[i]>max) {
    			max = candies[i];
    		}
    	}
    	List<Boolean> ans = new ArrayList<Boolean>();
    	ans.clear();
    	for(int i =0; i< candies.length;i++) {
    		if(candies[i]+extraCandies < max) {
    			ans.add(i, false);
    		}
    		else {
    			ans.add(i, true);
    		}
    	}
    	
    	return ans;
    }
}