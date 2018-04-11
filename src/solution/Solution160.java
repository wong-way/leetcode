package solution;

import util.ListNode;

/**
 * Created by DELL on 2017-07-25.
 */
public class Solution160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }
        return a;
    }

    public static void main(String args[]) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);

        ListNode b1 = new ListNode(3);
        ListNode b2 = new ListNode(4);
        ListNode b3 = new ListNode(5);

        ListNode c1 = new ListNode(6);
        ListNode c2 = new ListNode(7);
        ListNode c3 = new ListNode(8);

        a1.next = a2;
        a2.next = c1;

        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        c1.next=c2;
        c2.next=c3;


        ListNode result = getIntersectionNode(a1, b1);
        System.out.println(result.val);
    }

}
