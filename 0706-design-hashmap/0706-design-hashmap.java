class MyHashMap {

    private static class Entry {
        int key, value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<Entry>[] entries = new LinkedList[100];

    
    public void put(int key, int value) {
        var index = hash(key);
        if (entries[index] == null)
            entries[index] = new LinkedList<>();

        var bucket = entries[index];
        for (var entry : bucket)
            if (entry.key == key) {
                entry.value = value;
                return;
            }

        bucket.addLast(new Entry(key, value));
        
    }
    
    public int get(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket != null)
            for (var entry : bucket)
                if (entry.key == key)
                    return entry.value;

        return -1;
        
    }
    
     public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = entries[index];

        if (bucket == null)
            return;

        Iterator<Entry> iterator = bucket.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().key == key) {
                iterator.remove();
                return;
            }
        }
    }
    public int hash(int key){
        return key % entries.length;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */