class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class q2DoublyLinkedList {
    Node head;
    Node tail;

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getLength() {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAtPosition(int pos, int data) {
        if (pos == 1) {
            insertAtHead(data);
            return;
        }

        Node temp = head;
        int count = 1;
        while (count < pos - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            insertAtTail(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void deleteNode(int pos) {
        if (pos == 1) {
            if (head == null)
                return;
            Node temp = head;
            if (head.next != null) {
                head.next.prev = null;
            }
            head = head.next;
            temp.next = null;
        } else {
            Node curr = head;
            Node prev = null;
            int count = 1;

            while (count < pos && curr != null) {
                prev = curr;
                curr = curr.next;
                count++;
            }

            if (curr == null)
                return;

            if (curr.next == null) {
                tail = prev;
            } else {
                curr.next.prev = prev;
            }
            prev.next = curr.next;
            curr.next = null;
            curr.prev = null;
        }
    }

    public static void main(String[] args) {
        q2DoublyLinkedList dll = new q2DoublyLinkedList();

        dll.insertAtTail(20);
        dll.print();
        dll.insertAtTail(30);
        dll.print();

        dll.insertAtPosition(3, 54);
        dll.print();

        dll.insertAtPosition(1, 23);
        dll.print();

        dll.insertAtPosition(5, 43);
        dll.print();

        dll.deleteNode(5);
        dll.print();

        System.out.println("Head: " + dll.head.data);
        System.out.println("Tail: " + dll.tail.data);
    }
}