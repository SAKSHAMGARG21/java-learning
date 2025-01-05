import java.util.Scanner;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head;
    private Node tail;

    // Insert at head
    public void insertAtHead(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        if (tail == null) {
            tail = head; // If the list was empty
        }
    }

    // Insert at tail
    public void insertAtTail(int data) {
        Node temp = new Node(data);
        if (tail != null) {
            tail.next = temp;
        }
        tail = temp;
        if (head == null) {
            head = tail; // If the list was empty
        }
    }

    // Print the list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Insert at a given position
    public void insertAtPosition(int pos, int data) {
        if (pos == 1) {
            insertAtHead(data);
            return;
        }

        Node temp = head;
        int cnt = 1;

        while (cnt < pos - 1 && temp != null) {
            temp = temp.next;
            cnt++;
        }

        if (temp == null) {
            insertAtTail(data); // If position is greater than the length, insert at tail
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode; // Update tail if inserted at the end
        }
    }

    // Delete a node at a given position
    public void deleteNode(int pos) {
        if (pos == 1) {
            if (head != null) {
                Node temp = head;
                head = head.next;
                temp.next = null;
                // In Java, we don't need to explicitly free memory
                return;
            }
        } else {
            Node curr = head;
            Node prev = null;
            int cnt = 1;

            while (cnt < pos && curr != null) {
                prev = curr;
                curr = curr.next;
                cnt++;
            }

            if (curr != null) {
                prev.next = curr.next;
                if (curr.next == null) {
                    tail = prev; // Update tail if the last node is deleted
                }
                curr.next = null;
                // In Java, we don't need to explicitly free memory
            }
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Create a new linked list node
        list.insertAtHead(64);
        System.out.println(list.head.data);

        // Insert elements at tail
        list.insertAtTail(12);
        list.print();
        list.insertAtTail(35);
        list.print();

        // Insert at position
        list.insertAtPosition(4, 58);
        list.print();

        // Delete the first element
        list.deleteNode(1);
        list.print();
    }
}