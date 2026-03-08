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
          int ans = 0;  
    public void traversal(TreeNode curr, int maxSeenSoFar) {
        if (curr == null) return;
        if (curr.val >= maxSeenSoFar) ans++;
        int currMax = Math.max(maxSeenSoFar, curr.val);
        traversal(curr.left, currMax);
        traversal(curr.right, currMax);
    }
    public int goodNodes(TreeNode root) {
        traversal(root, Integer.MIN_VALUE);
        return ans;
    
    }
}