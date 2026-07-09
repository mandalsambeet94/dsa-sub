/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Map<Node, Node> map = new HashMap<>();
        Node current = head;
        while (current != null) {
            map.put(current, new Node(current.val));
            current = current.next;
        }

        Node curr = head;
        while(curr != null) {
            Node newNode2 = map.get(curr);
            //newNode2.val = curr.val;
            newNode2.next = map.get(curr.next);
            newNode2.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }

class Node1 {
    int val;
    Node1 next;
    Node1 random;

    Node1(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
}
