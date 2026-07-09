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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        
        // Traverse both lists
        while (l1 != null || l2 != null || carry > 0) {
            // Get values (0 if node is null)
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            // Calculate sum
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            
            // Create new node with the digit
            current.next = new ListNode(digit);
            current = current.next;
            
            // Move to next nodes
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummy.next;
        
    }

    private static int calculate(int a, int b) {
        String num1 = "", num2="";

        if(a == 0){
            num1 = "0";
        }else{
            while(a > 0) {
            num1 = num1.concat(String.valueOf(a%10));
            a= a/10;
        }
        }
        if(b ==0){
            num2 = "0";
        }else {
            while(b > 0) {
            num2 = num2.concat(String.valueOf(b%10));
            b= b/10;
        }
        }
        System.out.println(num1);
        System.out.println(num2);
        int sum = Integer.valueOf(num1) + Integer.valueOf(num2);
        return sum;
    }
}
