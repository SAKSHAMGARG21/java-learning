class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Que {

    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(int data) {

        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            tail = newnode;
        }

        tail.next = newnode;
        tail = newnode;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("que is empty");
            return -1;
        }

        int front = head.data;
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("que is empty");
            return -1;
        }
        return head.data;
    }

}

public class queUsingLinkedList {

    public static void main(String[] args) {

        Que q = new Que();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove() + " ");
        // q.add(5);
        // System.out.print(q.remove() + " ");
        // q.add(6);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }
}