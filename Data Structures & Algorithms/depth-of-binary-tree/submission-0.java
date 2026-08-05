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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queueNode = new LinkedList<>();
        queueNode.add(root);

        int level =0;
        while(!queueNode.isEmpty()){
            int size = queueNode.size();
            for(int i=0;i<size;i++){
                TreeNode current = queueNode.poll();
                if(current.left != null) queueNode.add(current.left);
                if(current.right != null) queueNode.add(current.right);
            }
            level++;
        }

        return level;
    }
}
