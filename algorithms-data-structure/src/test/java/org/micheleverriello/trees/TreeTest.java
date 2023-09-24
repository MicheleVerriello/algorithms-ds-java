package org.micheleverriello.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TreeTest {

    static ITreeOperations treeOperations = new TreeOperations();
    static TreeNode root;
    @BeforeEach
    public void setup() {
        root = treeOperations.addElement(null, 5);
        root = treeOperations.addElement(root, 57);
        root = treeOperations.addElement(root, 8);
        root = treeOperations.addElement(root, 1);
        root = treeOperations.addElement(root, 2);
        root = treeOperations.addElement(root, 9);
        root = treeOperations.addElement(root, 6);
        root = treeOperations.addElement(root, 3);
    }

    @Test
    public void addElementWithEmptyTree() {
        TreeNode root = treeOperations.addElement(null, 5);

        Assertions.assertEquals(5, root.getVal());
        Assertions.assertNull(root.getLeft());
        Assertions.assertNull(root.getRight());
    }

    @Test
    public void preOrderTraversal() {
        treeOperations.preOrderTraversal(root);
    }

    @Test
    public void inOrderTraversal() {
        treeOperations.inOrderTraversal(root);
    }

    @Test
    public void postOrderTraversal() {
        treeOperations.postOrderTraversal(root);
    }

    @Test
    public void depthFirstView() {
        treeOperations.depthFirstView(root);
    }

    @Test
    public void breadthFirstView() {
        treeOperations.breadthFirstView(root);
    }

    @Test
    public void depthFirstSearch() {
        TreeNode res = treeOperations.depthFirstSearch(root, 9);
        Assertions.assertNotNull(res);
        Assertions.assertEquals(9, res.getVal());
    }

    @Test
    public void depthFirstSearch_allLeft() {
        TreeNode res = treeOperations.depthFirstSearch(root, 3);
        Assertions.assertNotNull(res);
        Assertions.assertEquals(3, res.getVal());
    }

    @Test
    public void depthFirstSearch_noTarget() {
        TreeNode res = treeOperations.depthFirstSearch(root, 22);
        Assertions.assertNull(res);
    }

    @Test
    public void breadthFirstSearch() {
        TreeNode res = treeOperations.breadthFirstSearch(root, 6);
        Assertions.assertNotNull(res);
        Assertions.assertEquals(6, res.getVal());
    }

    @Test
    public void breadthFirstSearch_secondLevel() {
        TreeNode res = treeOperations.breadthFirstSearch(root, 8);
        Assertions.assertNotNull(res);
        Assertions.assertEquals(8, res.getVal());
    }

    @Test
    public void breadthFirstSearch_noTarget() {
        TreeNode res = treeOperations.breadthFirstSearch(root, 12);
        Assertions.assertNull(res);
    }

    @Test
    public void min() {
        int min = treeOperations.min(root);
        Assertions.assertEquals(1, min);
    }

    @Test
    public void max() {
        int max = treeOperations.max(root);
        Assertions.assertEquals(57, max);
    }

    @Test
    public void sum() {
        int sum = treeOperations.treeSum(root);
        Assertions.assertEquals(91, sum);
    }
}
