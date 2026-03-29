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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        TreeNode curr=root;
        List<Integer> ans=new ArrayList<>();
        TreeNode lastVisited=null;
        while(curr!=null || !s.isEmpty()){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            TreeNode peek=s.peek();
            if(peek.right!=null && peek.right!=lastVisited){
                curr=peek.right;
            }else{
                ans.add(peek.val);
                lastVisited=s.pop();
            }
        }
        return ans;
    }
}