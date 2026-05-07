class MyHashSet {
    // implement this with cahining
    private List<Integer>[] arr;
    int prime;
    public MyHashSet() {
        prime = 1009;
        arr = new LinkedList[prime];
    }
    
    public void add(int key) {
        int mod = key % prime;
        if(arr[mod] == null){
            arr[mod] = new LinkedList<>();
        }
        if(!arr[mod].contains(key)) arr[mod].add(key);
    }
    
    public void remove(int key) {
        int mod = key % prime;
        if(arr[mod] != null) arr[mod].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int mod = key % prime;
        return arr[mod] != null && arr[mod].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */