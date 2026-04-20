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
    int res=(int)-(1e9);
    public int maxPathSum(TreeNode root) {
        max(root);
        return res;
    }

    int max(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(0,max(root.left));
        int right=Math.max(0,max(root.right));
        int val=root.val;
        int lvr=left+val+right;
        int vr=val+right;
        int lr=val+left;
        res=Math.max(res,Math.max(val,Math.max(lvr,Math.max(vr,lr))));
        return Math.max(vr,lr);
    }
}
