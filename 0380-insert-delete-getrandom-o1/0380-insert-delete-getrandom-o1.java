class RandomizedSet {
    private final HashMap<Integer, Integer> map;
    private final ArrayList<Integer> arr;
    private final Random r;

    public RandomizedSet() {
        map = new HashMap<>();
        arr = new ArrayList<>();
        r = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        
        map.put(val, arr.size());
        arr.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;

        int indexVal = map.get(val);
        int lastElementIndex = arr.size()-1;
        int lastElement = arr.get(lastElementIndex);
        if(indexVal != lastElementIndex){
            arr.set(indexVal, lastElement);
            map.put(lastElement, indexVal);
        }        

        arr.remove(lastElementIndex);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return arr.get(r.nextInt(arr.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */