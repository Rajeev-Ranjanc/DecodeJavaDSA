package linkedList;

public class RemoveLoop {
    public static void removeLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            // there is no loop in the linked list
            return;
        }

        slow = head;
        while (slow != fast) {

            slow = slow.next;
            fast = fast.next;

        }
        Node prev = fast;
        while (prev.next != fast) {
            prev = prev.next;
        }
        prev.next = null;

    }
}
