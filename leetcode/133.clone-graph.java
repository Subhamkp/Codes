/*
 * @lc app=leetcode id=133 lang=java
 *
 * [133] Clone Graph
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    boolean vis[] = new boolean[200];
    Node[] nodes = new Node[105];

    Node getNode(int x) {
        if(nodes[x] != null) return nodes[x];
        else {
            nodes[x] = new Node(x);
            return nodes[x];
        }
    } 
    public Node cloneGraph(Node node) {
        if(node == null) return null;

        vis[node.val] = true;

        Node root = getNode(node.val);
        ArrayList<Node> list = new ArrayList<>();
        
        for(Node n : node.neighbors) {
            list.add(getNode(n.val));
            if(!vis[n.val]) {
                cloneGraph(n);
            }
        }
        root.neighbors = list;
        return root;
    }
}
// @lc code=end

