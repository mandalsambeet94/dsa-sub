/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {

        List<ListNode> arr = new ArrayList<>();
        ListNode curr = head;

        while(curr != null) {
            if(arr.contains(curr)) {
                return true;
            }
            arr.add(curr);
            curr=curr.next;
        }
        return false;
        
    }
}
