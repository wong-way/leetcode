package solution;

import util.ListNode;

/**
 * Created by DELL on 2018-04-11.
 */
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead =new ListNode(0);
        ListNode temp = new ListNode(0) ;
        newHead.next = temp;
        ListNode next = head;
        while(next!=null){
           if(next.val!=val){
               temp.next =new ListNode(next.val);
               temp = temp.next;
           }
           next=next.next;
        }
        return newHead.next.next;
    }
    public ListNode removeElements1(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode cur = fakeHead;

        while(cur.next!=null){
            if(cur.next.val==val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return fakeHead.next;
    }

    public static void main(String[] args) {
        Solution203 solution =new Solution203();
        ListNode node= new ListNode(1);
        ListNode node1= new ListNode(2);
        ListNode node2= new ListNode(3);
        node.next=node1;
        node1.next= node2;
        ListNode result = solution.removeElements1(node, 3);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }


    }
}
