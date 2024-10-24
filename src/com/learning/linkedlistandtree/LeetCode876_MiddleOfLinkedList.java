package com.learning.linkedlistandtree;

import com.learning.linkedlistandtree.predefine.*;
public class LeetCode876_MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode slow = temp;
        ListNode fast = temp;
        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
