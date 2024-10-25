package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;

public class LeetCode226_InvertTree {

    int level=0;
    public TreeNode invertTree(TreeNode root) {
        //post-order traversal
        if (root == null) return null;
        if (root.left != null) invertTree(root.left);
        if (root.right != null) invertTree(root.right);
        level++;
        if(level%2!=0) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        return root;
    }
}
