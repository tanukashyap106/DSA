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
    private int ans;
    private int count;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inorder(root);
        return ans;

    }

    public void inorder(TreeNode curr){
        if(curr==null) return;
        if(curr.left!=null) inorder(curr.left);
        count--;
        if(count==0){
         ans=curr.val; 
         return;
    }
    if(curr.right!=null) inorder(curr.right);
}
}
