class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = list1.length + list2.length;
        HashMap<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(int i = 0; i<list1.length; i++) map.put(list1[i], i);
        for(int j = 0; j<list2.length; j++){
            if(map.containsKey(list2[j])){
                int sum = j + map.get(list2[j]);
                if(sum == min) result.add(list2[j]);
                else if(sum<min){
                    result.clear();
                    result.add(list2[j]);
                    min = sum;
                }
            }
        }
        return result.toArray(new String[0]);
    }
}