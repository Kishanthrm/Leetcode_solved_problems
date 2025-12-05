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
    public int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer> set = new TreeSet<>();
        helper(root, set);
        System.out.print(set);
        if(set.size() == 1){
            return -1;
        }
        set.pollFirst();
        return set.pollFirst();
    }

    public void helper(TreeNode root, TreeSet<Integer> set) {
        if (root == null)
            return;
        set.add(root.val);
        helper(root.left, set);
        helper(root.right, set);
        return;
    }
}