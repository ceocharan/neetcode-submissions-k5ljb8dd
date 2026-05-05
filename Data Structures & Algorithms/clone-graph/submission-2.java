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
    public Node cloneGraph(Node node) {
        if(node==null){
            return node;
        }
        Map<Node,Node> m=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        Node newStart=new Node(node.val);
        Set<Node> st=new HashSet<>();
        m.put(node,newStart);
        Node t,temp,n1;
        while(!q.isEmpty()){
            t=q.poll();
            st.add(t);
            temp=m.get(t);
            for(Node te:t.neighbors){
                if(!m.containsKey(te)){
                    n1=new Node(te.val);
                    m.put(te,n1);
                }
                if(!temp.neighbors.contains(m.get(te)))
                    temp.neighbors.add(m.get(te));
                if(!st.contains(te)){                    
                    q.add(te);
                }
            }
        }
        return newStart;
        
    }
}