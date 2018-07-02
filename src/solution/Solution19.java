package solution;

import util.ListNode;

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fakerHead =new ListNode(0);
        fakerHead.next =head;
        ListNode faster = head;
        ListNode slower = fakerHead;
        int delay =0;
        while(faster!=null){

            faster= faster.next;
            delay++;
            if(delay >n)
                slower =slower.next;
            if(faster ==null)
                slower.next = slower.next.next;

        }
        return fakerHead.next;
    }
}
