package linkedList.doublylinklist;

public class DoublyLinkedList {
        ListNode head=null;
        ListNode tail=null;

        public void insertAtBeginning(int data){
            ListNode newNode = new ListNode(data);
            if(head == null){
                head=newNode;
                tail=newNode;
                return;
            }
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }

        public void insertAtEnd(int data){
         ListNode newNode = new ListNode(data);
            if(head == null){
                head=newNode;
                tail=newNode;
                return;
            }

//            ListNode currentNode=head;
//            while(currentNode.next != null){
//                currentNode=currentNode.next;
//            }
//            currentNode.next=newNode;
//            newNode.prev=currentNode;
//            tail=newNode;

            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }

        public void insertAtPosition(int data, int position){
            ListNode newNode = new ListNode(data);
            if(position == 1){
                insertAtBeginning(data);
                return;
            }

            ListNode currentNode=head;
            for (int i=1; i< position-1;i++){
                currentNode = currentNode.next;
                if(currentNode.next == null){
                    insertAtEnd(data);
                    return;
                }
            }
            newNode.next= currentNode.next;
            newNode.prev= currentNode;
            currentNode.next.prev=newNode;
            currentNode.next= newNode;

        }

        public void printList(){
         if(head == null){
             System.out.println("List is empty");
             return;
         }
         ListNode currentNode=head;
         while(currentNode.next != null){
             System.out.print(currentNode.data+"->");
             currentNode=currentNode.next;
         }
            System.out.println(currentNode.data);
        }
}
