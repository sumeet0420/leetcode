package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.TreeNode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode2583_KthLargestSumInABinaryTree {

    public long sum(TreeNode root, int k) {
        if (root == null) return -1;
        Queue<TreeNode> queue = new LinkedList<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            while (size-- > 0) {
                TreeNode current = queue.poll();
                sum += current.val;
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            pq.offer(sum);
            if (pq.size() > k)
                pq.poll();
        }
        return pq.size() < k ? -1 : pq.peek();
    }
}
