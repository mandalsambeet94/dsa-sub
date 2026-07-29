class MyHashMap {
    private final int[] arr;

    public MyHashMap() {
        arr = new int[1000001];
        Arrays.fill(arr, -2);
    }
    
    public void put(int key, int value) {
        arr[key] = value;
    }
    
    public int get(int key) {
        return arr[key] == -2 ? -1 : arr[key];
    }
    
    public void remove(int key) {
        arr[key]= -2;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */