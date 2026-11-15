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
        ListNode fast = head;
        ListNode half = head;
        while(fast != null && fast.next != null) {
            half = half.next;
            fast = fast.next.next;
        }
        ListNode p = null;
        ListNode q = half;
        while(q != null) {
            ListNode temp = q.next;
            q.next = p;
            p = q;
            q = temp;
        }
        ListNode n1 = head;
        ListNode n2 = p;
        while(n2.next != null) {
            ListNode n2Next = n2.next;
            n2.next = n1.next;
            n1.next = n2;
            n1 = n1.next.next;
            n2 = n2Next;
        }
    }
}
