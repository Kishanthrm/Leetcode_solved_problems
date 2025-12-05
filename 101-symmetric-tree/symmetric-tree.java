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
    public boolean isSymmetric(TreeNode root) {
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        helperleft(root.left, arr1);
        helperright(root.right, arr2);
        System.out.println(arr1);
        System.out.print(arr2);
        return arr1.equals(arr2);
    }

    public void helperleft(TreeNode root, List<String> res) {
        if (root == null) {
            res.add("null");
            return;
        }
        res.add(root.val+"");
        helperleft(root.left, res);
        helperright(root.right, res);
        return;
    }

    public void helperright(TreeNode root, List<String> res) {
        if (root == null) {
            res.add("null");
            return;
        }
        res.add(root.val+"");
        helperright(root.right, res);
        helperleft(root.left, res);
        return;
    }
}