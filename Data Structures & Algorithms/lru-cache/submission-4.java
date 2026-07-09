class LRUCache {
    private Map<Integer, Node> hmap;
    private int size = 0;
    private final int capacity;
    private Node head = null, tail = null;

    public LRUCache(int capacity) {
        this.hmap = new HashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!hmap.containsKey(key)) {
            return -1;
        }
        
        Node node = hmap.get(key);
        
        // If node is already at the end, nothing to do
        if (node == tail) {
            return node.val;
        }
        
        // If node is head
        if (node == head) {
            head = node.next;
            head.prev = null;
        } else {
            // Node is in the middle
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        
        // Move node to the end (make it most recent)
        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;
        
        return node.val;
    }

    public void put(int key, int value) {
        if (hmap.containsKey(key)) {
            // Update existing key
            Node node = hmap.get(key);
            node.val = value;
            
            // Move to end (same logic as get)
            if (node != tail) {
                if (node == head) {
                    head = node.next;
                    head.prev = null;
                } else {
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }
                
                tail.next = node;
                node.prev = tail;
                node.next = null;
                tail = node;
            }
            return;
        }
        
        // New key
        Node newNode = new Node(key, value);
        
        if (size == 0) {
            // Empty cache
            head = newNode;
            tail = newNode;
            hmap.put(key, newNode);
            size++;
        } else if (size == capacity) {
            // Cache is full - remove LRU (head)
            hmap.remove(head.key);
            
            if (head == tail) {
                // Only one node
                head = newNode;
                tail = newNode;
            } else {
                // Remove head
                head = head.next;
                head.prev = null;
                
                // Add new node at tail
                tail.next = newNode;
                newNode.prev = tail;
                newNode.next = null;
                tail = newNode;
            }
            
            hmap.put(key, newNode);
            // size remains the same
        } else {
            // Add to tail
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
            hmap.put(key, newNode);
            size++;
        }
    }
}
public class Node {
    int val;
    int key;
    Node next;
    Node prev;

    Node (int key, int val) {
        this.val = val;
        this.key = key;
    }
}