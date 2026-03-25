/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode lca=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      traversal(root,p,q);
      return lca;
    }
    private int traversal(TreeNode curr,TreeNode p,TreeNode q){
        if(curr==null) return 0;
        int left=traversal(curr.left,p,q);
        int right=traversal(curr.right,p,q);
        int mid=(curr==p || curr==q)?1:0;
        if(left+right+mid>=2 && lca==null){
            lca=curr;
        }
        return left+right+mid; 
    }
}