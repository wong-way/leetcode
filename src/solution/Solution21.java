package solution;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

import util.ListNode;

public class Solution21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val > l2.val) {
            newHead = l2;
            newHead.next = (mergeTwoLists(l1, l2.next));
        } else {
            newHead = l1;
            newHead.next = (mergeTwoLists(l1.next, l2));
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(6);

        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode result = mergeTwoLists(l1,n1);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}