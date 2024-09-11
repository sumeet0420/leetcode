package com.learning.linkedlist;

import com.learning.linkedlist.predefine.ListNode;
import com.learning.linkedlist.predefine.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode82_RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        //var root = TreeNode.createBasicTreeNode();
        var head=ListNode.createListFromArray(new Integer[]{1,1,2});
        LeetCode82_RemoveDuplicatesFromSortedList solution = new LeetCode82_RemoveDuplicatesFromSortedList();
        System.out.println(solution.deleteDuplicates(head));
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
