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
    public boolean isBalanced(TreeNode root) {
        // A -1 height means some subtree is unbalanced.
        return getHeight(root) != -1;
    }
private int getHeight(TreeNode node) {
    // Empty subtree has height 0.
    if (node == null) return 0;

    // Check children first (postorder traversal).
    int leftHeight = getHeight(node.left);
    if (leftHeight == -1) return -1; // Left subtree already failed.

    int rightHeight = getHeight(node.right);
    if (rightHeight == -1) return -1; // Right subtree already failed.

    // Current node is unbalanced if child heights differ by more than 1.
    if (Math.abs(leftHeight - rightHeight) > 1) return -1;

    // Return this subtree's height to its parent.
    return 1 + Math.max(leftHeight, rightHeight);
}
}
