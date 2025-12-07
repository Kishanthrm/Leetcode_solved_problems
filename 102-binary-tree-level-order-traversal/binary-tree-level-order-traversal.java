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
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)return list;
        helper(root,list);
        return list;
    }

    public void helper(TreeNode root,List<List<Integer>> list){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> li = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode top = queue.poll();
                li.add(top.val);
                if(top.left != null)queue.add(top.left);
                if(top.right != null)queue.add(top.right);
            }       
            list.add(li);     
        }
    }
}