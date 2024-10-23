package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1161_MaximumLevelSumOfBinaryTree {

    public int maxLevelSum(TreeNode root) {
        int maxLevel = 1;
        int currentLevel = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        long maxSum = root.val;
        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            while (size-- > 0) {
                TreeNode current = queue.poll();
                sum += current.val;
                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }
            if (sum > maxSum) {
                maxLevel = currentLevel;
                maxSum = sum;
            }
            currentLevel++;
        }
        return maxLevel;
    }
}
