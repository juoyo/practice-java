package com.apache.leetcode;

public class LC24 {
    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        p1.next = p2;
        p2.next = p3;
//        p3.next = p4;

       Solution24 s = new Solution24();
       System.out.println(s.swapPairs(p1));
    }
}

class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newNode = head;
        while (head != null && head.next != null) {  // 1，2位置交换，3, 4位置交换。。。，只改变了节点内部的值
            ListNode temp_node = new ListNode(0);
            temp_node.val = head.val;
            head.val = head.next.val;
            head.next.val = temp_node.val;
            head = head.next.next;
        }
        return newNode;
    }
}