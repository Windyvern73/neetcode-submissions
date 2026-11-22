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
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode dummy = new ListNode();
        ListNode p = dummy;
        int carry = 0;
        while(n1 != null && n2 != null) {
            int sum = n1.val + n2.val + carry;
            carry = 0;
            if(sum >= 10) {
                carry = 1;
                sum = sum % 10;
            }
            p.next = new ListNode(sum);
            n1 = n1.next;
            n2 = n2.next;
            p = p.next;
        }
        while(n1 != null) {
            int sum = n1.val + carry;
            carry = 0;
            if(sum >= 10) {
                carry = 1;
                sum = sum % 10;
            }
            p.next = new ListNode(sum);
            n1 = n1.next;
            p = p.next;
        }
        while(n2 != null) {
            int sum = n2.val + carry;
            carry = 0;
            if(sum >= 10) {
                carry = 1;
                sum = sum % 10;
            }
            p.next = new ListNode(sum);
            n2 = n2.next;
            p = p.next;
        }
        if(carry != 0) {
            p.next = new ListNode(1, null);
        }
        return dummy.next;
    }
}
