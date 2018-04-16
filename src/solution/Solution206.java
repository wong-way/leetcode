package solution;

import util.ListNode;

import java.util.List;

/**
 * Created by DELL on 2018-04-16.
 */
public class Solution206 {
    public ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverseList(head.next);
        ListNode cur = newHead;
        while(cur.next!=null){
            cur = cur.next;
        }
        cur.next  =head;
        head.next =null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        node.next=node1;
        node1.next =node2;
        Solution206 solution = new Solution206();
        ListNode result =solution.reverseList(node);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

}
