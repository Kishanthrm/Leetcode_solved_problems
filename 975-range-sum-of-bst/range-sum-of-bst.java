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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> arr = new ArrayList<>();
        int sum=0;
        helper(root,arr);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) >= low && arr.get(i) <= high){
                sum+=arr.get(i);
            }
        }
        return sum;
    }

    public void helper(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
        return;
    }
}