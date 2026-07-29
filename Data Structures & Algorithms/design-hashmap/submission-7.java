class MyHashMap {

    class Node{
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key= key;
            this.value= value;
        }
    }

    private Node[] node;

    public MyHashMap() {
        node = new Node[10000];
    }
    
    public void put(int key, int value) {
        if( node[key%node.length] == null) {
            node[key%node.length] = new Node(key, value);
        }
        else {
            Node curr = node[key%node.length];
            while(curr != null){
                if(curr.key == key) {
                    curr.value = value;
                    return;
                }
                if(curr.next == null) {
            
                    curr.next = new Node(key, value);
                    return;
                }
                curr = curr.next;
         }
            
        }
    }
    
    public int get(int key) {
        Node curr = node[key%node.length];
        while(curr!=null) {
            
            if(curr.key == key) {
                System.out.println("cdcd: "+ curr.key);
                return curr.value;
            }
            curr= curr.next;
        }
        return -1;
        
    }
    
    public void remove(int key) {
        int index = key % node.length;
    Node curr = node[index];
    
    if (curr == null) return;
    
    // Handle head removal
    if (curr.key == key) {
        node[index] = curr.next;
        return;
    }
    
    // Handle rest of list
    while (curr.next != null && curr.next.key != key) {
        curr = curr.next;
    }
    
    if (curr.next != null) {
        curr.next = curr.next.next;  // Remove the node
    }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */