/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       if (root == null) return "N";
        StringBuilder res = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                res.append("N,");
            } else {
                res.append(node.val).append(",");
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()>0 && data.charAt(0)=='N'){
            return null;
        }
        String arr[]=data.split(",");
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode h=new TreeNode(Integer.parseInt(arr[0]));
        q.add(h);
        int i=1;
        while(!q.isEmpty() && i<arr.length){
            int n=q.size();
            for(int j=0;j<n && i<arr.length;j++){
                TreeNode te=q.poll();
                if(i<arr.length){
                     if(!arr[i].equals("N")){
                        te.left=new TreeNode(Integer.parseInt(arr[i]));
                        q.add(te.left);

                     }
                    i++;
                }
                if(i<arr.length){
                    if(!arr[i].equals("N")){
                        te.right=new TreeNode(Integer.parseInt(arr[i]));
                        q.add(te.right);

                    }
                    i++;

                }
            }
        }
        return h;
    }
}
