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
        List<Integer> l1 = new ArrayList<>();
        // solve(root , l1);
        // return l1;

        if(root == null){
            return l1;
        }

        l1.add(root.val);
        l1.addAll(preorderTraversal(root.left));
        l1.addAll(preorderTraversal(root.right));
        return l1;
    }

    // void solve(TreeNode root , List<Integer> l1){
    //     if(root == null)
    // }
}