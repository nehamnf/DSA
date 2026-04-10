package Easy.linkedlist;

public class ReverseLinkedList_LC206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode prev=null;
        ListNode currentNode= head;

        while(currentNode != null){
           ListNode nextNode=currentNode.next;
            currentNode.next=prev;
            prev=currentNode;
            currentNode=nextNode;
        }
        return prev;
    }

    public void printList(ListNode head) {
        ListNode node=head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList_LC206 reverseLinkedList = new ReverseLinkedList_LC206();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.print("Original  : ");
        reverseLinkedList.printList(head);

        // save the new head after reversing
        ListNode reversed = reverseLinkedList.reverseList(head);
        System.out.print("Reversed  : ");
        reverseLinkedList.printList(reversed);

        // now reverse the reversed list using the correct head
        ListNode original = reverseLinkedList.reverseList(reversed);
        System.out.print("Reversed back : ");
        reverseLinkedList.printList(original);
    }
}
