package Easy.linkedlist;

public class MiddleOfLl_LC876 {
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
