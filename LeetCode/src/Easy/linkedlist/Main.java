package Easy.linkedlist;

public class Main {
    public static void main(String[] args) {
//        ListNode node = new ListNode(1);
//        node.next=new ListNode(2);
//        node.next.next=new ListNode(3);
//        node.next.next.next=new ListNode(4);
//        node.next.next.next.next=new ListNode(5);
//
//        MiddleOfLl_LC876 middleOfLl876 = new MiddleOfLl_LC876();
//        System.out.println(middleOfLl876.middleNode(node).val);
//
//        LinkedListCycle_LC141 cycle = new LinkedListCycle_LC141();
////        node.next.next.next.next.next = node.next.next;
//        System.out.println(cycle.hasCycle(node));


        MergeSortedList_LC21 mergeSortedListLc21 = new MergeSortedList_LC21();
        ListNode list1 = new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(9);
//        list1.next.next.next=new ListNode(5);

        ListNode list2 = new ListNode(3);
        list2.next=new ListNode(4);
        list2.next.next=new ListNode(5);

        ListNode result=mergeSortedListLc21.mergeTwoLists(list1,list2);
        mergeSortedListLc21.printList(result);



    }
}
