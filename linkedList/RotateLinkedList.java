package linkedList;

//https://leetcode.com/problems/rotate-list/description/

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

class L {
    ListNode head = null;

    public void insert(int val) {

        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void printList(ListNode head) {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");

    }

    public int length() {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
        }
        return count;
    }


    //    https://leetcode.com/problems/rotate-list/description/
    /*
        Logical good question to solve this we declare the two pointer one is slow and other is fast
        and first of all moved fast by kth time ahead in the linked list while slow is at pointing head.
        now runs a while loop till fast.next != null we move slow and fast by only one move. After doing
        this fast will be at the last of the linked list and slow will be at the node from where rotation
        should perform, so I declare a newHead which will be the next part of slow and then slow.next will
        put null, so it can be end part of linked list. and next part of fast will be head, By this our ll
        is rotated. To get understand better way try this in pen and paper
     */
    public ListNode rotateRight(int k) {
        //base case
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;

        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        k %= n;
        if (k == 0) {
            return head;
        }


        ListNode slow = head;
        ListNode fast = head;

        ListNode newHead = null;

        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {

            slow = slow.next;
            fast = fast.next;

        }

        newHead = slow.next;
        slow.next = null;
        fast.next = head;


//        printList(newHead);

        return newHead;


    }

}

public class RotateLinkedList {
    public static void main(String[] args) {
        L l = new L();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);

        l.rotateRight(2);
        l.printList(l.head);
    }

}
