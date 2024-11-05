public class file {
    Node head;
    private int size;

    file() {
        this.size = 0;
    }

    class Node {
        int num;
        Node next;

        Node(int data) {
            this.num = data;
            this.next = null;
            size++;
        }
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

    public void reverseList() {

        Node prev = null;
        Node curr = head;
        reverselist2(curr,prev);


        // if (head == null || head.next == null) {
        //     return;
        // }

        // Node prev = null;
        // Node curr = head;
        // while (curr != null) {
        //     Node fard = curr.next;
        //     curr.next = prev;

        //     prev = curr;
        //     curr = fard;
        // }

        // head = prev;

    }

    public void reverselist2(Node curr,Node prev) {

        if (curr==null){
            head=prev;
            return ;
        }

        Node fard=curr.next;
        curr.next=prev;
        reverselist2(fard,curr);
    }

    public static void main(String[] args) {
        file l1 = new file();

        l1.addtohead(4);
        l1.addtohead(1);
        l1.addtohead(5);
        l1.addtohead(9);
        l1.addtohead(9);
        l1.addtohead(7);
        l1.printList();

        l1.reverseList();
        l1.printList();

    }
}
