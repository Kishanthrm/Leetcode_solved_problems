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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> arr = new ArrayList<>();
        helper(root,arr, 0);
        return arr.contains(targetSum);
    }

    public void helper(TreeNode root, List<Integer> res,int sum){
        if(root == null){
            return;
        }
        sum+=root.val;
        if(root.left == null && root.right == null){
            res.add(sum);
            sum = 0;
            return; 
        }
        helper(root.left,res,sum);
        helper(root.right,res,sum);
    }
}