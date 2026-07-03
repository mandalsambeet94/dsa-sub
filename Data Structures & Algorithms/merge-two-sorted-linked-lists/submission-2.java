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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> arr = new ArrayList<>();
        //System.out.print("dsadsa" + new ListNode());

        if(list1 != null) {
            while(list1.next != null) {
            arr.add(list1.val);
            list1 = list1.next;
        }
        arr.add(list1.val);
        }
        
        if(list2 != null) {
            while(list2.next != null) {
            arr.add(list2.val);
            list2 = list2.next;
        }
        arr.add(list2.val);
        }
        

        Collections.sort(arr);

        for (int val: arr) {
            System.out.print(val + " ");
        }
        ListNode head = new ListNode();
        System.out.print("dsadsa: " + arr.size());
        if(arr.size() > 0){
            head.val = arr.get(0);
        }
        else{
            return null;
        }

        ListNode curr = head;


        for(int i= 1; i< arr.size(); i++) {
            ListNode newNode2 = new ListNode(arr.get(i));
            curr.next = newNode2;
            curr = curr.next;
        }

        return head;
        
    }
}