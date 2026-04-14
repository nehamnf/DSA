package linkedList.doublylinklist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(1);
        dll.insertAtEnd(2);
        dll.insertAtEnd(3);
        dll.insertAtEnd(4);
        dll.printList();
//        dll.insertAtPosition(5,3);
//        dll.printList();
//        dll.insertAtPosition(6,1);
//        dll.printList();

        dll.insertAtPosition(7,100);
        dll.printList();
//
//        dll.insertAtPosition(8,8);
//        dll.printList();
//
//        dll.insertAtPosition(7,5);
//        dll.printList();
    }
}
