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
    public String serialize(TreeNode root){
        StringBuilder sb=new StringBuilder();
        serializeHelper(root,sb);
        return sb.toString();
    }
    private void serializeHelper(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("-#");
            return;
        }
        sb.append("-").append(root.val);
        serializeHelper(root.left,sb);
        serializeHelper(root.right,sb);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String hashRoot=serialize(root);
        String hashSubRoot=serialize(subRoot);
        return hashRoot.contains(hashSubRoot);

        
    }
}