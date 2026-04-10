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
        list.insertAtPosition(50,2);
        list.display();
        list.deleteAtBeginning();
        System.out.println("After Deletion");
        list.display();
        list.deleteAtEnd();
        System.out.println("After Deletion at end");
        list.display();
        list.deleteAtPosition(4);
        System.out.println("After Deletion at position");
        list.display();
    }
}
