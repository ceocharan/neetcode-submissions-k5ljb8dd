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

class Solution {
    public boolean isValidBST(TreeNode root) {
        return inorder(root,new ArrayList<>());
    }

    boolean inorder(TreeNode root,List<Integer> l){
        if(root==null){
            return true;
        }
        if(!inorder(root.left,l)){
            return false;
        }
        if(l.size()>0 && l.get(0)>=root.val){
            return false;
        }
        else{
            if(l.size()==0){
                l.add(root.val);
            }
            else{
                l.set(0,root.val);
            }
        }
        if(!inorder(root.right,l)){
            return false;
        }
        return true;
    }
}
