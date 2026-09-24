class Solution {
    public int maxDepth(TreeNode root) {
        // Base case: an empty tree has a depth of 0
        if (root == null) {
            return 0;
        }
        
        // Recursively find the depth of left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        // The depth of the current node is the max of its subtrees + 1
        return Math.max(leftDepth, rightDepth) + 1;
    }
}