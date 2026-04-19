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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            m.put(inorder[i],i);
        }
        
        int istart=0,iend=inorder.length-1,pstart=0,pend=preorder.length-1;
        return bt(preorder,inorder,m,istart,iend,pstart,pend);

    }
    TreeNode bt(int[] preorder,int[] inorder,Map<Integer,Integer> m,
                    int istart,int iend,int pstart,int pend){
        if(istart>iend || pstart>pend){
            return null;
        }
        TreeNode root=new TreeNode(preorder[pstart]);
        int pos=m.get(root.val);
        int diff=pos-istart;
        root.left=bt(preorder,inorder,m,istart,pos-1,pstart+1,pend+diff);
        root.right=bt(preorder,inorder,m,pos+1,iend,pstart+diff+1,pend);
        return root;
    }
}
