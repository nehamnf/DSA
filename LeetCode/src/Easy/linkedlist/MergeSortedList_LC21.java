package Easy.linkedlist;

import java.util.ArrayList;

public class MergeSortedList_LC21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        ListNode temp = list1;
        while (temp != null) {
            arrayList1.add(temp.val);
            temp = temp.next;
        }

        System.out.println(arrayList1);
        temp = list2;
        while (temp != null) {
            arrayList2.add(temp.val);
            temp = temp.next;
        }

        System.out.println(arrayList2);
//        int minLength = Math.min(arrayList1.size(), arrayList2.size());
//
//        for (int i = 0; i < minLength; i++) {
//            if (arrayList1.get(i) <= arrayList2.get(i)) {
//                arrayList3.add(arrayList1.get(i));
//                arrayList3.add(arrayList2.get(i));
//            } else if (arrayList1.get(i) >= arrayList2.get(i)) {
//                arrayList3.add(arrayList2.get(i));
//                arrayList1.add(arrayList1.get(i));
//            }
//        }

//        if (arrayList1.size() > minLength) {
//            arrayList3.addAll(arrayList1.subList(minLength, arrayList1.size()));
//        }
//
//        if (arrayList2.size() > minLength) {
//            arrayList3.addAll(arrayList2.subList(minLength, arrayList2.size()));
//        }


        int i = 0, j = 0;
        while (i < arrayList1.size() && j < arrayList2.size()) {
            if (arrayList1.get(i) <= arrayList2.get(j)) {
                arrayList3.add(arrayList1.get(i));
                i++;
            } else {
                arrayList3.add(arrayList2.get(j));
                j++;
            }
        }

        while (i < arrayList1.size()) arrayList3.add(arrayList1.get(i++));
        while (j < arrayList2.size()) arrayList3.add(arrayList2.get(j++));

        ListNode head = new ListNode(arrayList3.get(0));
        ListNode curr = head;
        for (i = 1; i < arrayList3.size(); i++) {  // start from 1, not 0
            curr.next = new ListNode(arrayList3.get(i));
            curr = curr.next;
        }

        System.out.println(arrayList3);
        return head;
    }

    public void printList(ListNode head) {
        ListNode node=head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

}
