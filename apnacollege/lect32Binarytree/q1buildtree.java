import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

import javax.management.Query;

class Node {
    int data;
    Node right;
    Node left;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

}

class BinaryTree {
    int idx = -1; // Start from -1 because the first increment should set it to 0

    public Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node root = new Node(nodes[idx]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }

    public Node buildTree2(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val == -1)
            return null;
        root = new Node(val);
        root.left = buildTree(val);
        root.right = buildTree(val);
        return root;
    }

    public Node buildLevelorderTrav(int[] nodes) {

        if (nodes.length <= 0 || nodes[0] == -1) {
            return null;
        }

        Queue<Node> q = new LinkedList<>();
        Node root = new Node(nodes[0]);
        q.add(root);
        int idx = 1;
        while (idx < nodes.length && !q.isEmpty()) {

            Node node = q.poll();

            if (idx < nodes.length && nodes[idx] != -1) {
                node.left = new Node(nodes[idx]);
                q.add(node.left);
            }
            idx++;

            if (idx < nodes.length && nodes[idx] != -1) {
                node.right = new Node(nodes[idx]);
                q.add(node.right);
            }
            idx++;
        }
        return root;
    }

    public void preordertrav(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preordertrav(root.left);
        preordertrav(root.right);
    }

    public void inordertrav(Node root) {
        if (root == null) {
            return;
        }
        inordertrav(root.left);
        System.out.print(root.data + " ");
        inordertrav(root.right);
    }

    public void postordertrav(Node root) {
        if (root == null) {
            return;
        }
        postordertrav(root.left);
        postordertrav(root.right);
        System.out.print(root.data + " ");
    }

    public void printLevelOrderTrav(Node root) {

        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        q.offer(null);

        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.offer(null);
                }
            } else {
                System.out.print(node.data + " ");
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }

    }

    public void printLevelWiseTestpad(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.remove();
                System.out.print(node.data);
                if (i < size - 1) {
                    System.out.print(" ");
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            System.out.println();
        }
    }

    void inorder(Node root, int[] count) {
        if (root == null) {
            return;
        }
        inorder(root.left, count);
        // Leaf node
        if (root.left == null && root.right == null) {
            count[0]++;
        }
        inorder(root.right, count);
    }

    int noOfLeafNodes(Node root) {
        int[] count = { 0 };
        inorder(root, count);
        return count[0];
    }

    public int countNodeofbt(Node root) {
        if (root == null) {
            return 0;
        }

        int leftdata = countNodeofbt(root.left);
        int rightdata = countNodeofbt(root.right);
        return leftdata + rightdata + 1;
    }

    public int sumofNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = sumofNodes(root.left);
        int rightsum = sumofNodes(root.right);
        return leftsum + rightsum + root.data;
    }

    public int heightoftree(Node root) {
        if (root == null) {
            return 0;
        }

        int lft = heightoftree(root.left);
        int rgt = heightoftree(root.right);
        return Math.max(lft, rgt) + 1;
    }

    public int diameteroftree(Node root) {
        if (root == null) {
            return 0;
        }

        int dia1 = diameteroftree(root.left);
        int dia2 = diameteroftree(root.right);

        int left = heightoftree(root.left);
        int right = heightoftree(root.right);
        int dia3 = left + right + 1;

        return Math.max(dia3, Math.max(dia2, dia1));
    }

    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }

        Boolean lft = isBalanced(root.left);
        Boolean rght = isBalanced(root.right);

        Boolean th = Math.abs(heightoftree(root.left) - heightoftree(root.right)) <= 1;

        if (lft && rght && th) {
            return true;
        } else {
            return false;
        }
    }

    public void zigzagtrav(Node root) {

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        boolean flag = true;

        while (!q.isEmpty()) {
            int size = q.size();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                Node temp = q.poll();

                int idx = flag ? i : size - i - 1;
                arr[idx] = temp.data;

                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            flag = !flag;
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public int sumofkthnode(Node root, int k) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 0;
        int sum = 0;
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp != null) {
                if (level == k)
                    sum += temp.data;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            } else if (!q.isEmpty()) {
                q.add(null);
                level++;
            }
        }

        return sum;
    }

    public void travleft(Node root, ArrayList<Integer> arr) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }

        arr.add(root.data);
        if (root.left != null)
            travleft(root.left, arr);
        else
            travleft(root.right, arr);
    }

    public void travleaf(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            arr.add(root.data);
            return;
        }
        travleaf(root.left, arr);
        travleaf(root.right, arr);
    }

    public void travright(Node root, ArrayList<Integer> arr) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }

        if (root.right != null)
            travright(root.right, arr);
        else
            travright(root.left, arr);
        arr.add(root.data);
    }

    public ArrayList<Integer> boundrytraversal(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(root.data);
        travleft(root.left, arr);

        travleaf(root.left, arr);
        travleaf(root.right, arr);

        travright(root.right, arr);

        return arr;
    }

    public boolean isIdentical(Node r1, Node r2) {
        // Both trees are empty
        if (r1 == null && r2 == null) {
            return true;
        }

        // One tree is empty, and the other is not
        if (r1 == null || r2 == null) {
            return false;
        }

        // Check if the current nodes have the same data
        boolean val = r1.data == r2.data;

        // Recursively check for left and right subtrees
        boolean left = isIdentical(r1.left, r2.left);
        boolean right = isIdentical(r1.right, r2.right);

        // Return true only if current nodes match and both subtrees are identical
        return left && right && val;
    }

}

public class q1buildtree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nodes[] = new int[n];

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = sc.nextInt();
        }
        BinaryTree bt = new BinaryTree();

        // Node root = bt.buildTree(nodes);
        // bt.preordertrav(root);
        // System.out.println();
        // bt.inordertrav(root);
        // System.out.println();
        // bt.postordertrav(root);
        // System.out.println();
        // System.out.println("LevelOrder Traversal");
        // bt.printLevelOrderTrav(root);
        // System.out.println("LevelOrder Traversal Testpad without spaces");
        // bt.printLevelWiseTestpad(root);

        Node root = bt.buildLevelorderTrav(nodes);
        System.out.println("LevelOrder");
        bt.printLevelWiseTestpad(root);

        // System.out.println();
        // int countbtnodes = bt.countNodeofbt(root);
        // System.out.println(countbtnodes);

        // System.out.println();
        // int sumofNodes = bt.sumofNodes(root);
        // System.out.println(sumofNodes);

        // System.out.println();
        // int heightoftree = bt.heightoftree(root);
        // System.out.println(heightoftree);

        // System.out.println();
        // int diameteroftree = bt.diameteroftree(root);
        // System.out.println(diameteroftree);

        // System.out.println();
        // Boolean isBalanced= bt.isBalanced(root);
        // System.out.println(isBalanced);

        // System.out.println();
        // System.out.println("ZigZag traversal");
        // bt.zigzagtrav(root);

        // System.out.println();
        // int sumklevel = bt.sumofkthnode(root, 1);
        // System.out.println(sumklevel);

        // System.out.println();
        // ArrayList<Integer> arr= bt.boundrytraversal(root);
        // System.out.println(arr);

        int m = sc.nextInt();
        int nodes1[] = new int[m];

        for (int i = 0; i < m; i++) {
            nodes1[i] = sc.nextInt();
        }

        Node root1 = bt.buildLevelorderTrav(nodes1);
        System.out.println("LevelOrder2");
        bt.printLevelWiseTestpad(root1);

        System.out.println();
        System.out.println(bt.isIdentical(root, root1) ? 1 : 0);

    }
}
