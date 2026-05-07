class MyHashMap {
    // implement this with Array rehashing
    int[][] arr;
    int n = 4001;
    
    public MyHashMap() {
        arr = new int[2][n];
        Arrays.fill(arr[0], -1);
    }
    
    public void put(int key, int value) {
        int index = hash1(key);
        int i = 1;
        while(arr[0][index] >= 0 && arr[0][index] != key && i<n){
            index = (index + i * hash2(key)) % n;
            i++;
        }
        arr[0][index] = key;
        arr[1][index] = value;
    }
    
    public int get(int key) {
        int index = hash1(key);
        int i = 1;
        do{
            if(arr[0][index] == key) return arr[1][index];
            index = (index + i * hash2(key)) % n;
            i++;
        }while(arr[0][index] != -1 && i<n);
        return -1;
    }
    
    public void remove(int key) {
        int index = hash1(key);
        int i = 1;
        do{
            if(arr[0][index] == key) arr[0][index] = -2;
            index = (index + i * hash2(key)) % n;
            i++;
        }while(arr[0][index] != -1 && i<n);
    
    }

    int hash1(int key){
        return key%n;
    }

    int hash2(int key){
        return 1 + (key % (n - 1));
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */