package linkedList.circularlist;

public class ListNode {
     int data;
     ListNode next;

     public ListNode(){

     }

     public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(ListNode next, int data) {
        this.next = next;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
