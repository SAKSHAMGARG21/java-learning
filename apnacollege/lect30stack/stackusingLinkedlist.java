
class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class Stack {
    public static Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {

        Node newnode = new Node(data);
        if (isEmpty()) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int top = head.data;
        head = head.next;
        return top;

    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return head.data;
    }

}

public class stackusingLinkedlist {

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
