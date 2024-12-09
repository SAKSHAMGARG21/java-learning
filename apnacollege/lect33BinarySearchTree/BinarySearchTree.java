import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    Node root;

    public Node insertInput(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data > root.data) {
            root.right = insertInput(root.right, data);
        } else {
            root.left = insertInput(root.left, data);
        }

        return root;
    }

    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        int data;

        System.out.println("Enter data for BST (enter -1 to stop):");
        while ((data = scanner.nextInt()) != -1) {
            root = insertInput(root, data);
        }
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

    public void inorderTraversal(Node root) {
        if (root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public void preorderTraversal(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public void postorderTraversal(Node root) {
        if (root == null)
            return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public Node minValue(Node root) {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    public Node maxValue(Node root) {
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp;
    }

    public Node deleteNodeBST(Node root, int val) {
        if (root == null) {
            return root;
        }

        if (root.data == val) {
            // 0 child
            if (root.left == null && root.right == null) {
                return null;
            }

            // 1 child
            if (root.left != null && root.right == null) {
                return root.left;
            }

            if (root.left == null && root.right != null) {
                return root.right;
            }

            // 2 child
            if (root.left != null && root.right != null) {
                int mini = minValue(root.right).data;
                root.data = mini;
                root.right = deleteNodeBST(root.right, mini);
                return root;
            }
        } else if (root.data > val) {
            root.left = deleteNodeBST(root.left, val);
            return root;
        } else {
            root.right = deleteNodeBST(root.right, val);
            return root;
        }
        return root;
    }

    public void printInrangeInbst(Node root,int x,int y){
        if (root==null){
            return ;
        }

        if (root.data >= x && root.data<=y){
            printInrangeInbst(root.left, x, y);
            System.out.print(root.data+" ");
            printInrangeInbst(root.right, x, y);
        }else if (root.data >= y){
            printInrangeInbst(root.left, x, y);
        }else {
            printInrangeInbst(root.right, x, y);
        }

    }


    public void printroottoleafpath(Node root, ArrayList<Integer> arr){
        if (root==null){
            return ;
        }
        arr.add(root.data);
        if (root.left==null && root.right==null){
            printpath(arr);
        }else{
            printroottoleafpath(root.left, arr);
            printroottoleafpath(root.right, arr);
        }
        arr.remove(arr.size()-1);
    }

    public void printpath(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+"->");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        // int[] arr = { 50, 30, 20, 40, 70, 60, 80 };
        int[] arr={8,5,3,1,4,6,10,11,14};
        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < arr.length; i++) {
            bst.root = bst.insertInput(bst.root, arr[i]);
        }
        
        // BinarySearchTree bst = new BinarySearchTree();
        // bst.takeInput();

        System.out.println("Printing the data in BST (Level Order):");
        bst.levelOrderTraversal(bst.root);

        System.out.print("Printing the inorder traversal: ");
        bst.inorderTraversal(bst.root);
        System.out.println();

        System.out.print("Printing the preorder traversal: ");
        bst.preorderTraversal(bst.root);
        System.out.println();

        System.out.print("Printing the postorder traversal: ");
        bst.postorderTraversal(bst.root);
        System.out.println();

        if (bst.root != null) {
            System.out.println("Min value is " + bst.minValue(bst.root).data);
            System.out.println("Max value is " + bst.maxValue(bst.root).data);

            bst.root = bst.deleteNodeBST(bst.root, 30); // Example delete

            System.out.println("Printing the data in BST after deletion (Level Order):");
            bst.levelOrderTraversal(bst.root);
        }

        System.out.println("In range of the bst");
        bst.printInrangeInbst(bst.root,20,60);
    
        
        // ArrayList<Integer> arr = new ArrayList([1,3,4,5,6,8,10,11,14 ]);
        ArrayList<Integer> arrlist = new ArrayList<>();
        System.out.println("Print the path of the bst");
        bst.printroottoleafpath(bst.root, arrlist);

    }
}