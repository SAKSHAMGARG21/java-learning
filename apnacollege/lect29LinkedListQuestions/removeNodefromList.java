import java.util.*;

class Node {
    int num;
    Node next;

    Node(int data) {
        this.num = data;
        this.next = null;
    }
}

class Solution {
    public Node removeNodefromListNthFromEnd(Node head, int n) {

        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        int k = c - n;

        Node prev = head;
        int i = 1;
        while (i < k) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }
}

public class removeNodefromList {

    private Node head;
    private Node tail;

    public void addtotail(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
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

    public static void main(String[] args) {
        removeNodefromList l1 = new removeNodefromList();

        l1.addtotail(4);
        l1.addtotail(1);
        l1.addtotail(5);
        l1.addtotail(9);
        l1.addtotail(8);
        l1.addtotail(7);
        l1.printList();

        Solution obj = new Solution();

        obj.removeNodefromListNthFromEnd(l1.head, 2);
        l1.printList();

    }
}
