import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class detectIsCircular {
    public static Node tail;

    public static void insertNode(int ele, int d) {
        // empty list
        if (tail == null) {
            Node newNode = new Node(d);
            tail = newNode;
            newNode.next = newNode;
        } else {
            // if list is not empty
            Node curr = tail;

            while (curr.data != ele) {
                curr = curr.next;
            }

            Node temp = new Node(d);
            temp.next = curr.next;
            curr.next = temp;
        }
    }

    public static void print() {
        Node temp = tail;

        if (tail == null) {
            System.out.println("list is empty");
            return;
        }
        do {
            System.out.print(tail.data + " ");
            tail = tail.next;
        } while (tail != temp);
        System.out.println();
    }

    public static void deleteNode(int ele) {
        // empty
        if (tail == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node prev = tail;
            Node curr = prev.next;

            while (curr.data != ele) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = curr.next;
            // 1 NODE linked list
            if (curr == prev) {
                tail = null;
            }

            // >=2 node
            else if (tail == curr) {
                tail = prev;
            }
            curr.next = null;
            curr = null; // Help GC
        }
    }

    public static boolean isCircular(Node head) {
        // Write your code here
        if (head == null)
            return false;
        Map<Node, Boolean> visited = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            if (visited.getOrDefault(temp, false)) {
                return true;
            }
            visited.put(temp, true);
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {

        detectIsCircular obj = new detectIsCircular();

        insertNode(5, 3);
        print();

        insertNode(3, 2);
        print();

        insertNode(2, 7);
        print();

        insertNode(7, 9);
        print();

        insertNode(9, 25);
        print();

        insertNode(3, 5);
        print();

        deleteNode(3);
        print();

        if (isCircular(obj.tail)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}