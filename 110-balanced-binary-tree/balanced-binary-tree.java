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
    public boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return ans;
    }

    public int depth(TreeNode root){
        if(root == null || ans == false) return 0;

        else if(Math.abs(depth(root.left) - depth(root.right)) > 1) ans = false;

        return 1 + Math.max(depth(root.left) , depth(root.right));

    }
}