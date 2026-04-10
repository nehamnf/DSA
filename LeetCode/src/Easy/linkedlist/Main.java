package Easy.linkedlist;

public class Main {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        node.next.next.next.next=new ListNode(5);

        MiddleOfLl_LC876 middleOfLl876 = new MiddleOfLl_LC876();
        System.out.println(middleOfLl876.middleNode(node).val);

        LinkedListCycle_LC141 cycle = new LinkedListCycle_LC141();
//        node.next.next.next.next.next = node.next.next;
        System.out.println(cycle.hasCycle(node));

    }
}
