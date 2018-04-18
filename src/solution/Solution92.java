package solution;

import util.ListNode;

/**
 * Created by DELL on 2018-04-16.
 */
public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode prev = null;
        ListNode cur = head;
        if (head == null || head.next == null)
            return head;
        if (m == 1) {
            int count = 1;
            ListNode temp = null;
            while (count <= n) {
                temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
                count++;
            }
            head.next = temp;
            return prev;
        } else {
            head.next = reverseBetween(head.next, m - 1, n - 1);
            return head;
        }


    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        Solution92 solution = new Solution92();
        ListNode res = solution.reverseBetween(node1, 2, 6);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
