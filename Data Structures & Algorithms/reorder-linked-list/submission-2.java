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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        //ListNode mid = head;
        ListNode lHead = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //System.out.println("fast: "+ fast.val);
        //System.out.println("slow: "+ slow.val);

        //mid = slow;

        ListNode rHead = slow.next;
        slow.next = null;

        ListNode prev =null;
        ListNode curr = rHead;

        while(curr != null) {
            ListNode tmp = curr.next;
            curr.next= prev;
            prev = curr;
            curr= tmp;
        }

        rHead = prev;
        //System.out.println("rHead: "+ rHead.next.val);


        while(rHead != null) {
            ListNode lTemp = lHead.next;
            ListNode rTemp = rHead.next;
            lHead.next = rHead;
            rHead.next = lTemp;
            lHead = lTemp;
            rHead = rTemp;
        }


        
    }
}
