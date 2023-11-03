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
    public Boolean ans = true;
    public boolean isBalanced(TreeNode root) {        

        depth(root);
        return ans;

    }

    public int depth(TreeNode root){
        if(ans == false) return 0;
        if(root == null){
            return 0;
        }

        if(Math.abs(depth(root.left) - depth(root.right))>1){
            ans = false;
        }
        return 1 + Math.max(depth(root.left),depth(root.right));
    }
}