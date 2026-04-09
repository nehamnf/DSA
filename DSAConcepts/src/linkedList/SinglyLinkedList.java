package linkedList;

public class SinglyLinkedList {
    private Node head;

//    public void insert(int data){
//        if(head == null){
//            head = new Node(data);
//            return;
//        }
//        System.out.println("Enter where to insert the data \n 1.Begining \n 2.End \n 3.Insert at Position");
//        switch (new java.util.Scanner(System.in).nextInt()){
//            case 1:
//                insertAtBeginning(data);
//                break;
//            case 2:
//                insertAtEnd(data);
//                break;
//            case 3:
//                System.out.println("Enter the position to insert the data");
//                int position = new java.util.Scanner(System.in).nextInt();
//                insertAtPosition(data,position);
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
//    }

    public void insertAtBeginning(int data){
        Node newNode= new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode= head;
        while(currentNode.getNext() != null){
            currentNode=currentNode.getNext();
        }
        currentNode.setNext(newNode);
    }

    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);

        if(position == 1){
            newNode.setNext(head);
            head = newNode;
            return;
        }
        Node currentNode = head;
        Node temp=head;
        for(int i=1;i < position;i++){
            if(currentNode == null){
                System.out.println("Invalid position "+position);
                return;
            }
            temp=currentNode;
            currentNode =currentNode.getNext();
        }
            temp.setNext(newNode);
            newNode.setNext(currentNode);
    }

    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.println("data : "+temp.getData());
            temp=temp.getNext();
        }
    }
}
