package linkedList.doublylinklist;

public class ListNode {
    int data;
    ListNode next;
    ListNode prev;

    public ListNode(){
    }

    public ListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
