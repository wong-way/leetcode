package solution;

import util.ListNode;

/**
 * Created by DELL on 2017-07-12.
 */
public class Solution83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode newHead =new ListNode(head.val);
        ListNode temp=newHead;
        while(head!=null){
            if(head.val != temp.val){
                temp.next = new ListNode(head.val);
                temp=temp.next;
            }
            head=head.next;
        }
        return newHead;
    }
    public ListNode deleteDuplicates2(ListNode head) {
        if(head==null) return head;
        ListNode walker = head;
        ListNode runner = head;
        while(walker!=null){
            if(runner.val !=walker.val)
            {
                runner.next = walker;
                runner= runner.next;
            }
            walker = walker.next;
        }
        runner.next =null;
        return head;
    }
    public static ListNode deleteDuplicates1(ListNode head){
        if(head == null || head.next == null)
            return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }
    public static void main(String args[]) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(2);
        ListNode t4 = new ListNode(3);
        t1.next = t2;
        t2.next = t3;
      //  t3.next = t4;
        ListNode result = deleteDuplicates(t1);
        while(result!=null){
            System.out.println(result.val);
            result= result.next;
        }
    }
}
