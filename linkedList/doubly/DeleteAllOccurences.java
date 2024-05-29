package linkedList.doubly;

import java.util.ArrayList;

public class DeleteAllOccurences {
    private class Node {
        private int val;
        private Node next;
        private Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head = null;

    private void insert(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
        newNode.prev = ptr;

    }

    private void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "<->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    private void displayReverse() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node prevNode = temp;

        do {
            System.out.print(prevNode.val + "<->");
            prevNode = prevNode.prev;
        } while (prevNode != null);

        System.out.println("end");
    }

    //    https://www.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list
    /*
        To solve this problem this is pretty simple and fast-forward to solve this I have declared a temp
        var to traverse the linked list. run a while loop till null and check is temp.data is equal to x
        if yes then again make a check for the first element that is temp is head if yes then move ahead head
         by one. Then we declare two nodes first is prevNode which contains prev of temp and another is nextNode
         that will contain next part of temp. and made check that nextNode is not null if it is not null then
         prev of nextNode will be the prevNode and same as prevNode if it is not null then it's next part will
         be the nextNode. and keep traversing temp = temp.next till the last of the linked lsit

     */
    Node deleteAllOccurOfX(Node head, int x) {

        Node temp = head;

        while (temp != null) {

            if (temp.val == x) {

                if (temp == head) {
                    head = head.next;
                }
                Node nextNode = temp.next;
                Node prevNode = temp.prev;

                if (nextNode != null) {
                    nextNode.prev = prevNode;

                }
                if (prevNode != null) {
                    prevNode.next = nextNode;
                }
                temp = temp.next;
            } else {
                temp = temp.next;
            }
        }
        display(head);
        return head;

    }

    //    https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-pairs-with-given-sum-in-doubly-linked-list
    public ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        /*
            extreme brute force I can think about this is of in O(n^2) solution
            let's complete this by O(n^2)

            this is the correct solution although it is in O(n^2) so it gives TLE

         */

//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        /*
        Node temp = head;

        while (temp != null) {

            Node nextNode = temp.next;

            while (nextNode != null && temp.val + nextNode.val < target) {

                int sum = temp.val + nextNode.val;

                if (sum == target) {

                    ArrayList<Integer> ans = new ArrayList<>();

                    ans.add(temp.val);

                    ans.add(nextNode.val);

                    list.add(ans);
                }

                nextNode = nextNode.next;
            }

            temp = temp.next;
        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        return list;

         */
        /*
        Now optimal one is using two pointer approach we declare left pointer which is pointing head
        and right pointer which is pointing tail of the linked list and did it if sum is greater than
        target then move previous one step of tail pointer and if it is greater than we move one step
        forward left point to right and if sum and target are equal then added both number into list
        and that list added into final list which is to be return and move left one step forward and
        right one step backward
         */
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


        Node left = head;

        Node right = findTail(head);

        while (left.val < right.val) {

            int sum = left.val + right.val;

            if (sum < target) {

                left = left.next;

            } else if (sum > target) {

                right = right.prev;

            } else {

                ArrayList<Integer> ans = new ArrayList<>();

                ans.add(left.val);

                ans.add(right.val);

                list.add(ans);

                left = left.next;

                right = right.prev;

            }

        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        return list;
    }

    private Node findTail(Node head) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        return temp;

    }

    //    https://www.geeksforgeeks.org/problems/remove-duplicates-from-a-sorted-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=remove-duplicates-from-a-sorted-doubly-linked-list
/*
        Remove duplicate elements from dll we first handle the base case if head is null or there is only one number in
        the linked list that case. After It, I have declared a temp variable which is pointing head of the linked list 1
        another node is nextNode which is ahead of one node form head and if the val of temp and nextNode is equal then I
        moved forward the nextNode and if not then we link the link as doubly linked list. and most important after getting
        out of while loop I forgot to make temp.next null again this is very important.Don't forget to make this.

*/
    Node removeDuplicates(Node head) {
        // Code Here.
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        Node nextNode = temp.next;
        while (nextNode != null) {

            if (temp.val == nextNode.val) {
                nextNode = nextNode.next;
            } else {
                temp.next = nextNode;
                nextNode.prev = temp;
                temp = nextNode;
                nextNode = nextNode.next;
            }
        }
//        very important line I forgot to apply this
        temp.next = null;
        display(head);
        return head;
    }

    public static void main(String[] args) {
        DeleteAllOccurences dl = new DeleteAllOccurences();
        dl.insert(1);
        dl.insert(1);
        dl.insert(1);
        dl.insert(2);
        dl.insert(3);
        dl.insert(4);


        dl.display(dl.head);

//        dl.deleteAllOccurOfX(dl.head, 2);

//        dl.displayReverse();
//        dl.findPairsWithGivenSum(7, dl.head);

        dl.removeDuplicates(dl.head);

    }


}
