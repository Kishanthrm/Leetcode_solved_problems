/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return helper(cloned, target);
    }

    public final TreeNode helper(final TreeNode cloned, final TreeNode target) {
        if (cloned == null) {
            return null;
        }
        if (cloned.val == target.val) {
            return cloned;
        }
        final TreeNode l = helper(cloned.left, target);
        final TreeNode r = helper(cloned.right, target);
        if (l != null) {
            return l;
        }
        if (r != null) {
            return r;
        } else {
            return null;
        }
    }
}