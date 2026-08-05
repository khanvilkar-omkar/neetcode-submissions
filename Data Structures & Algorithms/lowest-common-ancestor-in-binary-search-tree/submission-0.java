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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int low = Math.min(p.val, q.val);
        int high = Math.max(p.val, q.val);
    while (root != null) {
        if (root.val < low) {
            root = root.right;       // Both nodes are to the right
        } else if (root.val > high) {
            root = root.left;        // Both nodes are to the left
        } else {
            return root;             // Split point, or p/q is the ancestor
        }
    }
    return null;
    }
}
