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

    public Node midoflist(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node revList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node fard = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fard;
        }
        head.next=null;
        return prev;
    }

    public boolean checkPlan(Node head) {
        Node mid = midoflist(head);
        Node revhead = revList(mid);

        Node curr = head;
        while (curr != null && revhead!=null) {
            if (curr.num!=revhead.num){
                return false;
            }

            curr=curr.next;
            revhead=revhead.next;
        }

        return true;
    }
}

public class checkplandrome {
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
        checkplandrome l1 = new checkplandrome();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            l1.addtotail(arr[i]);
        }

        // l1.printList();

        Solution obj = new Solution();

        System.out.println((obj.checkPlan(l1.head)) ? "true" : "false");

        // Node mid = obj.midoflist(l1.head);
        // System.out.println(mid.num);
    }
}
