package linkedList.circularlist;

public class Main {
    public static void main(String[] args) {
        CircularList circularList = new CircularList();
        circularList.insertAtBeginning(1);
        circularList.insertAtBeginning(2);
        circularList.insertAtBeginning(3);
        circularList.insertAtEnd(4);
        circularList.insertAtEnd(5);
        circularList.printList(circularList.head);

        circularList.insertAtPosition(6, 6);
        circularList.printList(circularList.head);

        circularList.insertAtPosition(6, 9);
        circularList.printList(circularList.head);

        circularList.deleteAtBeginning();
        circularList.printList(circularList.head);

        circularList.deleteAtEnd();
        circularList.printList(circularList.head);

        circularList.deleteAtPosition(3);
        circularList.printList(circularList.head);

        circularList.deleteAtPosition(4);
        circularList.printList(circularList.head);

        circularList.deleteAtPosition(5);
        circularList.printList(circularList.head);
    }
}
