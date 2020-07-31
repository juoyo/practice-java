package com.apache.leetcode;

public class LC24_2 {
    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;

       Solution24_2 s = new Solution24_2();
       System.out.println(s.swapPairs(p1));
    }
}

class Solution24_2 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newNode = head.next;
        while (head != null && head.next != null) {
            ListNode first_node = head;
            ListNode second_node = head.next;
            first_node.next = second_node.next;
            second_node.next = first_node;

            head = head.next.next;
        }
        return newNode;
    }
}