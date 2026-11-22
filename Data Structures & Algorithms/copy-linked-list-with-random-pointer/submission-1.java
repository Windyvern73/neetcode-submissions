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
        HashMap<Node, Node> nodes = new HashMap<>();
        Node p = head;
        while(p != null) {
            Node curr = null;
            if(nodes.get(p) == null) {
                nodes.put(p, new Node(p.val));
            }
            curr = nodes.get(p);
            if(nodes.get(p.next) == null) {
                if(p.next != null) {nodes.put(p.next, new Node(p.next.val));}
            }
            curr.next = nodes.get(p.next);
            if(nodes.get(p.random) == null) {
                if(p.random != null) {nodes.put(p.random, new Node(p.random.val));}
            }
            curr.random = nodes.get(p.random);
            p = p.next;
        }
        return nodes.getOrDefault(head, null);
    }
}
