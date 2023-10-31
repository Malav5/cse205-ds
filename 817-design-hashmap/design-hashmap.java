class MyHashMap {

    HashMap<Integer , Integer> hm1 = new HashMap<>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        hm1.put(key , value);
    }
    
    public int get(int key) {
        if(hm1.get(key) == null) return -1;
        return hm1.get(key);
    }
    
    public void remove(int key) {
        hm1.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */