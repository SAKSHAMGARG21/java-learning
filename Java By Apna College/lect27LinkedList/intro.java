import java.util.*;
class Node {
    Node head;
    Node next;
    int size;
    int num;

    Node() {
        this.size = 0;
    }

    Node(int data) {
        this.num = data;
        this.next = null;
        size++;
    }

    public void addtohead(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addtotail(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newnode;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }

        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            secNode = secNode.next;
            lastNode = lastNode.next;
        }

        secNode.next = null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.num + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }
}

public class intro {
    public static void main(String[] args) {
        Node l1 = new Node();

        l1.addtohead(4);
        l1.addtohead(1);
        l1.addtohead(5);
        l1.printList();

        l1.addtotail(9);
        l1.printList();

        l1.deleteFirst();
        l1.printList();

        l1.deleteLast();
        l1.printList();

        int size = l1.getSize();
        System.out.println(size);
        l1.addtohead(8);
        l1.printList();
        System.out.println(l1.getSize());
        

        System.out.println(l1.head.num);

    }
}
