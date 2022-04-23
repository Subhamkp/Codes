/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
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
        if (head == null) {
            return null;
        }
        
        Map<Node, Node> map = new HashMap<>();
        
        // 1. copy all nodes
        Node node = head;
        while (node != null) {
            // map.put(node, new Node(node.val, null, null));// it is ok.
            map.put(node, new Node(node.val));
            node = node.next;
        }

        // 2. link pointers, according to relationship of the old nodes
        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }

        return map.get(head);
    }
}
// @lc code=end

