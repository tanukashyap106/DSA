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
    boolean ans=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        traverse(root,0,targetSum);
        return ans;
        
    }
    private void traverse(TreeNode curr,int currSum,int targetSum){
        int newSum=currSum+curr.val;
        if(curr.left==null && curr.right==null){
            if(newSum==targetSum){
                ans=true;
            }
        }
        if(curr.left!=null) traverse(curr.left,newSum,targetSum);
        if(curr.right!=null) traverse(curr.right,newSum,targetSum);
    }
}