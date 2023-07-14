package org.micheleverriello.binarytrees;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p != null && q != null) {
            return isSameNode(p, q);
        } else if (p == null && q == null) {
            return true;
        } else {
            return false;
        }

    }


    public boolean isSameNode(TreeNode p, TreeNode q) {
        boolean isSameNode = false;

        if(p.val == q.val) {

            // left side
            if(p.left != null && q.left != null) {
                isSameNode = isSameNode(p.left, q.left);
            } else if (p.left == null && q.left == null) {
                isSameNode = true;
            } else {
                return false;
            }

            // right side
            if(isSameNode) {
                if(p.right != null && q.right != null) {
                    isSameNode = isSameNode(p.right, q.right);
                } else if(p.right == null && q.right == null) {
                    isSameNode = true;
                } else {
                    return false;
                }
            }
        }

        return isSameNode;
    }
}
