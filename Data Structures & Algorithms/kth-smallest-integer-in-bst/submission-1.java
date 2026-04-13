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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l=new ArrayList<>();
        inorder(root,l,k);
        return l.get(1);
    }

    void inorder(TreeNode root,List<Integer> l,int k){
        if(root==null){
            return;
        }
        inorder(root.left,l,k);
        if(l.size()==0){
            l.add(1);
            l.add(root.val);
        }
        else{
            if(l.get(0)<k){
                l.set(0,l.get(0)+1);
                l.set(1,root.val);
            }
            else{
                return;
            }
        }
        inorder(root.right,l,k);
    }
}
