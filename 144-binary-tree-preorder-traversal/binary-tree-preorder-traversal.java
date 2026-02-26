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
    public List<Integer> preorderTraversal(TreeNode root) {
        List ans=new ArrayList<>();
        traversal(root,ans);
        return ans;
    }
    public void traversal(TreeNode curr,List ans){
        if(curr==null) return;
        ans.add(curr.val);
        traversal(curr.left,ans);
        traversal(curr.right,ans);
    }
    
        
    
}