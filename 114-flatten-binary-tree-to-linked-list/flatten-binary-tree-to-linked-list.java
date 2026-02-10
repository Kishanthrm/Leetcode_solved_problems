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
    List<TreeNode> arr = new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root == null) return;
        helper(root);
        for (int i = 0; i < arr.size() - 1; i++) {
            TreeNode curr = arr.get(i);
            TreeNode next = arr.get(i + 1);

            curr.left = null;
            curr.right = next;
        }
    }

    public void helper(TreeNode root){
        if(root == null) return;
        arr.add(root);
        helper(root.left);
        helper(root.right);
    }
}