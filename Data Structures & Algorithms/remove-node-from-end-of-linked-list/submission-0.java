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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr = head;
        int count =0;
        while(curr != null) {
            count++;
            curr=curr.next;
        }

        int nodeToDelete = (count - n) +1;
        ListNode del = head, prev = null;

        while(nodeToDelete != 1) {
            prev = del;
            del = del.next;
            nodeToDelete--;
        }

        if(del == head) {
            if(del.next != null){
                head = del.next;
            }
            else{
                head = null;
            }

        }else{
            prev.next = del.next;
        }

        return head;

    }
}
