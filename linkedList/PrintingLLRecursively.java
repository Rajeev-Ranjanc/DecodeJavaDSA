package linkedList;

/*
Printing linked list recursively
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

    Node() {
        this.data = 0;
        next = null;
    }

}

public class PrintingLLRecursively {
    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void display(Node head) {

        Node temp = head;

        if (temp == null) {
            return;
        }

        //this will print linked list recursively
//        System.out.print(temp.data+"->");
//        display(head.next);


//        This will print linked list in reverse order
        display(head.next);
        System.out.print(temp.data + "->");

    }

    public int size() {
        Node temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public int getElement(int index) {
        if (index < 0 || index >=size()) {
            return -1;
        }
        Node temp = head;
        while (index-- > 0) {
            temp = temp.next;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        PrintingLLRecursively pr = new PrintingLLRecursively();
        pr.insert(1);
        pr.insert(2);
        pr.insert(3);
        pr.insert(4);
        pr.insert(5);

        pr.display(pr.head);

        System.out.println();
        System.out.println(pr.getElement(5));
    }
}
