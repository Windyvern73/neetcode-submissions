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
        int length = 0;
        ListNode node = head;
        while(node != null) {
            length++;
            node = node.next;
        }
        ListNode p = null;
        ListNode q = head;
        for(int i = 0; i < length - n; i++) {
            p = q;
            q = q.next;
        }
        if(p == null) {
            head = q.next;
        }
        else {
            p.next = q.next;
        }
        return head;
    }
}
