import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }
}

class bst {

    public Node createbst(Node root, int data) {
        if (data == -1) {
            return root;
        }
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = createbst(root.left, data);
        } else {
            root.right = createbst(root.right, data);
        }
        return root;
    }

    public void levelOrderTraversal(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp == null) {
                System.out.println();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
    }

    public Node helpercreatebst(int[] arr, int s, int e) {
        if (s>e || s<0){
            return null;
        }
        int mid = s + (e - s) / 2;
        Node root = new Node(arr[mid]);
        root.left=helpercreatebst( arr, s, mid - 1);
        root.right=helpercreatebst( arr, mid + 1, e);
        return root;
    }

    public Node createbstfromsortedarr(int arr[]) {
        if (arr.length == 0)
            return null;

        return helpercreatebst(arr,0,arr.length-1);
    }
}

public class createBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        bst t = new bst();
        // Node root = null;
        // for (int i = 0; i < arr.length; i++) {
        //     root = t.createbst(root, arr[i]);
        // }
        // t.levelOrderTraversal(root);
        
        Node root=t.createbstfromsortedarr(arr);
        t.levelOrderTraversal(root);

    }
}
