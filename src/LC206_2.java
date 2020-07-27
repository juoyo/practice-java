import java.util.ArrayList;
import java.util.List;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}

public class LC206_2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        Solution206_2 s = new Solution206_2();
        System.out.println(s.reverseList(head));

    }
}


class Solution206_2 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode resnode = head;
        List<Integer> ls = new ArrayList<>();

        int i = 0;
        while (head != null) {
//            ls.set(i, head.val);
            ls.add(head.val);
            head = head.next;
            i = i + 1;
        }

        ListNode p = resnode;

        for (int j = ls.size() - 1; j >= 0; j--) {
            p.val = ls.get(j);
            p = p.next;
        }
        return resnode;
    }
}