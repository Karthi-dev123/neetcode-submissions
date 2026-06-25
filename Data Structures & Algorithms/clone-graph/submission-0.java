/*
Definition for a Node.
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
    HashMap<Node,Node> clone = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null ) return null ;
        return dfs(node);
    }

    public Node dfs(Node node){
        if(clone.containsKey(node)) return clone.get(node);

        // if its not present then make a copy 
        Node clone_node = new Node(node.val);

        clone.put(node,clone_node);

        for(Node neighbour_node : node.neighbors){
            clone_node.neighbors.add(dfs(neighbour_node));
        }

        return clone_node;
    }
}