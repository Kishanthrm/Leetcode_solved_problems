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
    public int countNodes(TreeNode root) {
        return helper(root,0);
    }

    public int helper(TreeNode root, int ctr){
        if(root == null){
            return ctr;
        }
        ctr++;
        // System.out.print(ctr + " ");
        int l=helper(root.left,ctr);
        int r=helper(root.right,l);
        // System.out.print(ctr + " ");
        return r;
    }
}