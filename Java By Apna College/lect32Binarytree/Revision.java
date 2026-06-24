import java.util.*;

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    public int idx = -1;

    public Node BuildTree(int[] arr) {
        idx++;
        if (arr[idx] == -1 || idx >= arr.length) {
            return null;
        }

        Node root = new Node(arr[idx]);
        root.left = BuildTree(arr);
        root.right = BuildTree(arr);
        return root;
    }

    public Node buildTreeLevelOrder(int[] arr) {
        if (arr.length == 0 ) return null;
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.add(root);
        int idx = 1;
        while (!q.isEmpty() && idx < arr.length) {
            Node curr = q.poll();
            if (idx < arr.length && arr[idx] != -1) {
                curr.left = new Node(arr[idx++]);
                q.add(curr.left);
            }
            if (idx < arr.length && arr[idx] != -1) {
                curr.right = new Node(arr[idx++]);
                q.add(curr.right);
            }
        }
        return root;
    }

    public void printLevelWiseTestpad(Node root) {
        if (root == null)
            System.out.println("Tree is empty");

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node curr = q.poll();
                System.out.print(curr.data);
                if (i < n - 1)
                    System.out.print(" ");
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            System.out.println();
        }
    }

    
}

public class Revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        BinaryTree bt = new BinaryTree();
        // Node root = bt.BuildTree(arr);
        Node root = bt.buildTreeLevelOrder(arr);
        bt.printLevelWiseTestpad(root);

    }
}
