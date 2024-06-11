package linkedList;

public class MergeLinkedList {
    Node sortedMerge(Node head1, Node head2) {
        Node dummyHead = new Node(-1);
        Node temp = dummyHead;
        Node t1 = head1;
        Node t2 = head2;

        while (t1 != null && t2 != null) {

            if (t1.data > t2.data) {

                temp.next = t2;
                t2 = t2.next;

            } else {

                temp.next = t1;
                t1 = t1.next;

            }

            temp = temp.next;

        }
        if (t1 == null) {
            temp.next = t2;
            temp = temp.next;
        }
        if (t2 == null) {
            temp.next = t1;
            temp = temp.next;
        }
        return dummyHead.next;

    }
}
