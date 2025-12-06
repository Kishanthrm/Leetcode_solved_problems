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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        Helper(root,arr);
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++){
            min = Math.min(min,arr.get(i) - arr.get(i - 1));
        }
        return min;
    }

    public void Helper(TreeNode root, List<Integer> arr){
        if(root == null){
            return;
        }
        arr.add(root.val);
        Helper(root.left,arr);
        Helper(root.right,arr);
        return;
    }
}