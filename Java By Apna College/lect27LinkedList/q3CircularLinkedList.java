import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class q3CircularLinkedList {

    private Node tail;

    public q3CircularLinkedList() {
        this.tail = null;
    }

    public void insertNode(int element, int data) {
        // Empty list
        if (tail == null) {
            Node newNode = new Node(data);
            tail = newNode;
            newNode.next = newNode;
        } else {
            // Non-empty list
            Node curr = tail;
            while (curr.data != element) {
                curr = curr.next;
            }
            Node temp = new Node(data);
            temp.next = curr.next;
            curr.next = temp;
        }
    }

    public void print() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = tail;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail);
        System.out.println();
    }

    public void deleteNode(int element) {
        // Empty list
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node prev = tail;
        Node curr = prev.next;

        // Find the node to delete
        while (curr.data != element) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;

        // 1-node list
        if (curr == prev) {
            tail = null;
        }
        // >=2-node list
        else if (tail == curr) {
            tail = prev;
        }
        curr.next = null;
    }

    public static void main(String[] args) {
        q3CircularLinkedList cll = new q3CircularLinkedList();

        cll.insertNode(5, 3);
        cll.print();

        cll.insertNode(3, 2);
        cll.print();

        cll.insertNode(2, 7);
        cll.print();

        cll.insertNode(7, 9);
        cll.print();

        cll.insertNode(9, 25);
        cll.print();

        cll.insertNode(3, 5);
        cll.print();
        
        cll.deleteNode(3);
        cll.print();
    }
}