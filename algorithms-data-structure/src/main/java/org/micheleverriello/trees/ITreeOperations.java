package org.micheleverriello.trees;

public interface ITreeOperations {
    void preOrderTraversal(TreeNode root);
    void inOrderTraversal(TreeNode root);
    void postOrderTraversal(TreeNode root);
    TreeNode addElement(TreeNode root, int target);
    TreeNode removeElement(TreeNode root, int target);
    int max(TreeNode root);
    int min(TreeNode root);
    void depthFirstView(TreeNode root);
    void breadthFirstView(TreeNode root);
    TreeNode depthFirstSearch(TreeNode root, int target);
    TreeNode breadthFirstSearch(TreeNode root, int target);
    int treeSum(TreeNode root);
    int maxPathToLeafSum(TreeNode root);
}
