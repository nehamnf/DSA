package linkedList.circularlist;

public class CircularList {
    ListNode head=null;
    ListNode tail=null;

    public void insertAtBeginning(int data){
        ListNode newNode=new ListNode(data);
        if(head == null){
            head = newNode;
            tail=newNode;
            tail.next=head;
            return;
        }
        newNode.next=head;
        head=newNode;
        tail.next=head;
    }

    public void insertAtEnd(int data){
        ListNode newNode=new ListNode(data);
        if(head == null){
            head = newNode;
            tail=newNode;
            tail.next=head;
            return;
        }
        newNode.next=head;
        tail.next=newNode;
        tail=newNode;
    }

    public void insertAtPosition(int data, int position){
        ListNode newNode=new ListNode(data);

        if(position == 1){
            insertAtBeginning(data);
            return;
        }

        ListNode currentNode=head;
        for(int i=1;i < position-1;i++){
            currentNode=currentNode.next;
            if (currentNode == tail) {   // stop here, don't go past tail
                insertAtEnd(data);
                return;
            }
        }
        newNode.next=currentNode.next;
        currentNode.next=newNode;
    }

    public void deleteAtBeginning(){
        if(head == null){
            System.out.println("List is empty, Cannot delete ");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        head=head.next;
        tail.next=head;
    }

    public void deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty, cannot delete.");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        ListNode currentNode = head;
        while(currentNode.next != tail){
            currentNode = currentNode.next;
        }
        currentNode.next = head;
        tail = currentNode;
    }

    public void deleteAtPosition(int position){
        if (head == null){
            System.out.println("List is empty, cannot delete.");
            return;
        }
        if(position == 1){
            deleteAtBeginning();
            return;
        }
        ListNode currentNode=head;
        for (int i=1;i < position -1;i++){
            currentNode=currentNode.next;
            if(currentNode == tail){
                System.out.println("Invalid position: "+position);
                return;
            }
        }
        currentNode.next=currentNode.next.next;
        if(currentNode.next == head){
            tail=currentNode;
        }
    }
    public void printList(ListNode head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        ListNode temp=head;
        while(temp.next != head){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}
