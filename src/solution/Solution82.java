package solution;

import util.ListNode;

public class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null) return head;

        ListNode prev = head;
        ListNode steper = head;
        ListNode newHead = new ListNode(-1);
        ListNode counter = newHead;
        int count =0;
        while(steper!=null){
            if(steper.val == prev.val) {
                count++;
            }else{
                if(count>1){
                    prev = steper;
                    count = 1;
                }else{
                    counter.next = new ListNode(prev.val);
                    counter = counter.next;
                    prev = steper;
                    count = 1;
                }
            }
            steper = steper.next;
        }
        if(prev.val!=counter.val&&count<=1)
            counter.next = new ListNode(prev.val);
        return newHead.next;
    }
}
