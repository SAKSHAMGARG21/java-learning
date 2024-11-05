import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

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

// Pair class to hold node and horizontal distance
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
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
}

class Solution {

    private int postIndex;
    private  int findPosition(int[] in, int startIndex, int element, int n) {
        for (int i = startIndex; i < n; i++) {
            if (in[i] == element) {
                return i;
            }
        }
        return -1;
    }
    private Node buildTreeUtil(int[] in, int[] post, int startIndex, int endIndex) {
        if (postIndex < 0 || startIndex > endIndex) {
            return null;
        }
        int element = post[postIndex--];
        Node root = new Node(element);
        int pos = findPosition(in, startIndex, element, in.length);
        // Build the right subtree first (since we are using postorder)
        root.right = buildTreeUtil(in, post, pos + 1, endIndex);
        root.left = buildTreeUtil(in, post, startIndex, pos - 1);
        return root;
    }
    public Node buildTree(int[] in, int[] post,int n) {
        postIndex = n- 1; // Initialize postIndex to the last index
        return buildTreeUtil(in, post, 0, n - 1);
    }
    public void preordertrav(Node root){
        if (root==null){
            return ;
        }

        System.out.print(root.data+" ");
        preordertrav(root.left);
        preordertrav(root.right);
    }

    private int preIndex;
    private  int findPosition2(int[] in, int startIndex, int element, int n) {
        for (int i = startIndex; i < n; i++) {
            if (in[i] == element) {
                return i;
            }
        }
        return -1;
    }
    private Node buildTreehelperinandpre(int[] in, int[] pre, int startIndex, int endIndex) {
        if (preIndex >= in.length || startIndex > endIndex) {
            return null;
        }
        int element = pre[preIndex++];
        Node root = new Node(element);
        int pos = findPosition2(in, startIndex, element, in.length);
        // Build the right subtree first (since we are using postorder)
        root.left = buildTreehelperinandpre(in, pre, startIndex, pos - 1);
        root.right = buildTreehelperinandpre(in, pre, pos + 1, endIndex);
        return root;
    }
    public Node buildTreeinandpre(int[] in, int pre[],int n) {
        preIndex = 0; // Initialize postIndex to the last index
        return buildTreehelperinandpre(in, pre, 0, n - 1);
    }

}

public class createTreefromarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in[] = new int[n];

        for (int i = 0; i < in.length; i++) {
            in[i] = sc.nextInt();
        }
        int post[] = new int[n];

        for (int i = 0; i < n; i++) {
            post[i] = sc.nextInt();
        }


        BinaryTree bt = new BinaryTree();
        Solution s = new Solution();
        
        Node root=s.buildTree(in,post, n);
        s.preordertrav(root);
        System.out.println();
        Node root2=s.buildTreeinandpre(in, post, n);
        s.preordertrav(root2);

    }
}
