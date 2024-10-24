package com.learning.linkedlistandtree;
import com.learning.linkedlistandtree.predefine.TreeNode;

public class LeetCode951_EquivalentTree {

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;

        boolean isSame = flipEquiv(root1.left,root2.left) &&   flipEquiv(root1.right,root2.right);
        boolean swap = flipEquiv(root1.left,root2.right) &&   flipEquiv(root1.right,root2.left);
        return isSame || swap;
    }
}
