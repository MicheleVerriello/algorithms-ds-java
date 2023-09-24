package org.micheleverriello.trees;

import java.util.ArrayDeque;

public class TreeOperations implements ITreeOperations{
    @Override
    public void preOrderTraversal(TreeNode root) {
        if(root != null) {
            System.out.println(root.getVal());
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
        }
    }

    @Override
    public void inOrderTraversal(TreeNode root) {
        if(root != null) {
            preOrderTraversal(root.getLeft());
            System.out.println(root.getVal());
            preOrderTraversal(root.getRight());
        }
    }

    @Override
    public void postOrderTraversal(TreeNode root) {
        if(root != null) {
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
            System.out.println(root.getVal());
        }
    }

    @Override
    public TreeNode addElement(TreeNode root, int target) {
        if (root == null) return new TreeNode(target, null, null);

        if (target > root.getVal()) {
            root.setRight(addElement(root.getRight(), target));
        } else if (target < root.getVal()) {
            root.setLeft(addElement(root.getLeft(), target));
        } else {
            System.out.println("Element already Exists");
            return root;
        }

        return root;
    }

    @Override
    public TreeNode removeElement(TreeNode root, int target) {

        if(root == null) return null;

        if(target < root.getVal()) {
            root.setLeft(removeElement(root.getLeft(), target));
        } else if(target > root.getVal()) {
            root.setRight(removeElement(root.getRight(), target));
        } else {

        }

        return null;
    }

    @Override
    public int max(TreeNode root) {
        int max = Integer.MIN_VALUE;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        if(root != null) {
            stack.addLast(root);
            while (!stack.isEmpty()) {
                TreeNode current = stack.removeLast();
                max = Math.max(max, current.getVal());

                if(current.getRight() != null) stack.addLast(current.getRight());
                if(current.getLeft() != null) stack.addLast(current.getLeft());
            }
        }

        return max;
    }

    @Override
    public int min(TreeNode root) {
        int min = Integer.MAX_VALUE;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        if(root != null) {
            stack.addLast(root);
            while (!stack.isEmpty()) {
                TreeNode current = stack.removeLast();
                min = Math.min(min, current.getVal());

                if(current.getRight() != null) stack.addLast(current.getRight());
                if(current.getLeft() != null) stack.addLast(current.getLeft());
            }
        }

        return min;
    }

    @Override
    public void depthFirstView(TreeNode root) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();

        if(root != null) stack.addLast(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.removeLast();
            System.out.println(current.getVal());

            if(current.getRight() != null) stack.addLast(current.getRight());
            if(current.getLeft() != null) stack.addLast(current.getLeft());
        }
    }

    @Override
    public void breadthFirstView(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if(root != null) queue.addFirst(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode current = queue.removeLast();
                print(current.getVal());
                if(current.getLeft() != null) queue.addFirst(current.getLeft());
                if(current.getRight() != null) queue.addFirst(current.getRight());
            }
        }
    }

    @Override
    public TreeNode depthFirstSearch(TreeNode root, int target) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        if(root != null) {
            stack.addLast(root);

            while (!stack.isEmpty()) {
                TreeNode current = stack.removeLast();
                print(current.getVal());
                if(current.getVal() == target) return current;

                if(current.getRight() != null) stack.addLast(current.getRight());
                if(current.getLeft() != null) stack.addLast(current.getLeft());
            }
        }

        return null;
    }

    @Override
    public TreeNode breadthFirstSearch(TreeNode root, int target) {

        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if(root != null) {
            queue.addFirst(root);

            while(!queue.isEmpty()) {
                int size = queue.size();
                for(int i = 0; i < size; i++) {
                    TreeNode current = queue.removeLast();
                    print(current.getVal());
                    if(current.getVal() == target) return current;

                    if(current.getLeft() != null) queue.addFirst(current.getLeft());
                    if(current.getRight() != null) queue.addFirst(current.getRight());
                }
            }
        }

        return null;
    }

    @Override
    public int treeSum(TreeNode root) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        int sum = 0;
        if(root != null) {
            stack.addLast(root);
            while (!stack.isEmpty()) {
                TreeNode current = stack.removeLast();
                sum += current.getVal();

                if(current.getRight() != null) stack.addLast(current.getRight());
                if(current.getLeft() != null) stack.addLast(current.getLeft());
            }
        }

        return sum;
    }

    @Override
    public int maxPathToLeafSum(TreeNode root) {
        return 0;
    }

    private boolean isLeafNode(TreeNode node) {
        return node.getLeft() == null && node.getRight() == null;
    }


    private void print(Object o) {
        System.out.println(o.toString());
    }
}
