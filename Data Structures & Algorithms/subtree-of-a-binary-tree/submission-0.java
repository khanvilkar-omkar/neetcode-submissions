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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // An empty tree is always a subtree.
        if (subRoot == null) return true;
        if (root == null) return false;
        
    // Check current node, then search both child subtrees.
    return isSameTree(root, subRoot)
            || isSubtree(root.left, subRoot)
            || isSubtree(root.right, subRoot);
}

private boolean isSameTree(TreeNode a, TreeNode b) {
    // Both null means this branch matches.
    if (a == null && b == null) return true;

    // Different structure or values means no match.
    if (a == null || b == null || a.val != b.val) return false;

    // Both left and right children must match exactly.
    return isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
}
}
