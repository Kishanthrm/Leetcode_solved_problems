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
    public int sumRootToLeaf(TreeNode root) {
       return helper(root, "", 0);
    }

    public int helper(TreeNode root,String num,int sum){
        if(root == null){
            return sum;
        }
        num +=(root.val+"");
        if(root.left == null && root.right == null){
            int decimalNumber = Integer.parseInt(num, 2);
            sum+=decimalNumber;
        }
        int l = helper(root.left,num,sum);
        int r = helper(root.right,num,l);
        return r;
    }
}