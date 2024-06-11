package linkedList;


import java.util.List;

public class Palindrome {
    /*
        https://leetcode.com/problems/palindrome-linked-list/

        Brute force 1: Copy all elements of the linked list into an array and check that array
                       palindrome or not
        Brute Force 2: Make a deep copy of the linked list and reverse them and now check both the
                       linked list are equal while traversing if no return false otherwise return true

         Optimal    : Reverse Second Halves of the linked list
                      store into a variable and ran a loop while second.next!=null if first and second data is not
                      equal then return false otherwise return true
                      https://leetcode.com/problems/palindrome-linked-list/

     */
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = reverse(slow);
        slow.next = null;

        slow = head;

        while (slow.next != null && temp.next != null) {
            if (slow.val != temp.val) {
                return false;
            }
            slow = slow.next;
            temp = temp.next;

        }
        return true;


    }

    private ListNode reverse(ListNode head) {
        ListNode nextNode = head;
        ListNode currNode = head;
        ListNode prevNode = null;

        while (nextNode != null) {
            nextNode = nextNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

        }

        return prevNode;
    }

}
