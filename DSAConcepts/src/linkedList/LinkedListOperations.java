package linkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        singlyLinkedList();
    }

    public static void singlyLinkedList(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtPosition(50,7);
        list.display();
    }
}
