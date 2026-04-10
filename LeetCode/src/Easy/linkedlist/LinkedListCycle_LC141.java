package Easy.linkedlist;

public class LinkedListCycle_LC141 {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        if(head.next == null) return false;

        ListNode slow=head;
        ListNode fast=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
