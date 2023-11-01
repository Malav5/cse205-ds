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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return level;

        q.add(root);

        while(!q.isEmpty()){
            int l_size = q.size();
            List<Integer> curr_level = new ArrayList<>();

            for(int i = 0 ; i < l_size ; i++){
                TreeNode curr_Node = q.poll();
                curr_level.add(curr_Node.val);

                if(curr_Node.left != null) q.add(curr_Node.left);

                if(curr_Node.right != null) q.add(curr_Node.right);

            }

            level.add(curr_level);
        }

        return level;
    }
}