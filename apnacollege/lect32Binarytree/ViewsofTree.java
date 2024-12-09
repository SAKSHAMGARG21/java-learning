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

    public void lefthelper(Node root, ArrayList<Integer> list, int lvl) {
        if (root == null) {
            return;
        }

        if (lvl == list.size())
            list.add(root.data);

        lefthelper(root.left, list, lvl + 1);
        lefthelper(root.right, list, lvl + 1);
    }

    public ArrayList<Integer> leftviewoftree(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        lefthelper(root, list, 0);
        return list;
    }

    public void righthelper(Node root, ArrayList<Integer> list, int lvl) {
        if (root == null) {
            return;
        }

        if (lvl == list.size())
            list.add(root.data);

        lefthelper(root.right, list, lvl + 1);
        lefthelper(root.left, list, lvl + 1);
    }

    public ArrayList<Integer> rightviewoftree(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        righthelper(root, list, 0);
        return list;
    }

    public List<Integer> topView(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Map<Integer, Integer> topNode = new TreeMap<>();
        Queue<Pair<Node, Integer>> q = new LinkedList<>();

        q.add(new Pair<>(root, 0));

        while (!q.isEmpty()) {
            Pair<Node, Integer> temp = q.poll();
            Node frontNode = temp.getKey();
            int hd = temp.getValue();

            // If one value is present for a HD, then do nothing
            if (!topNode.containsKey(hd)) {
                topNode.put(hd, frontNode.data);
            }

            if (frontNode.left != null) {
                q.add(new Pair<>(frontNode.left, hd - 1));
            }
            if (frontNode.right != null) {
                q.add(new Pair<>(frontNode.right, hd + 1));
            }
        }

        ans.addAll(topNode.values());
        return ans;
    }

    public List<Integer> verticalOrder(Node root) {
        // Map to hold vertical order traversal
        Map<Integer, Map<Integer, List<Integer>>> nodes = new TreeMap<>();
        Queue<Pair<Node, Pair<Integer, Integer>>> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        // Starting with the root node at horizontal distance 0 and level 0
        q.add(new Pair<>(root, new Pair<>(0, 0)));

        while (!q.isEmpty()) {
            Pair<Node, Pair<Integer, Integer>> temp = q.poll();
            Node frontNode = temp.getKey();
            int hd = temp.getValue().getKey(); // Horizontal distance
            int lvl = temp.getValue().getValue(); // Level

            // Add the node's value to the corresponding hd and lvl
            nodes.putIfAbsent(hd, new TreeMap<>());
            nodes.get(hd).putIfAbsent(lvl, new ArrayList<>());
            nodes.get(hd).get(lvl).add(frontNode.data);

            // Add left and right children to the queue
            if (frontNode.left != null) {
                q.add(new Pair<>(frontNode.left, new Pair<>(hd - 1, lvl + 1)));
            }
            if (frontNode.right != null) {
                q.add(new Pair<>(frontNode.right, new Pair<>(hd + 1, lvl + 1)));
            }
        }

        // Construct the final answer from the map
        for (Map<Integer, List<Integer>> levelMap : nodes.values()) {
            for (List<Integer> levelList : levelMap.values()) {
                ans.addAll(levelList);
            }
        }

        return ans;
    }

    public List<Integer> bottomView(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        // Map to store the bottom view nodes
        Map<Integer, Integer> bottomNode = new TreeMap<>();
        Queue<Pair<Node, Integer>> q = new LinkedList<>();

        // Start with the root node at horizontal distance 0
        q.add(new Pair<>(root, 0));

        while (!q.isEmpty()) {
            Pair<Node, Integer> temp = q.poll();
            Node frontNode = temp.getKey();
            int hd = temp.getValue();

            // Update the map with the current node's value
            bottomNode.put(hd, frontNode.data);

            // Add left and right children to the queue
            if (frontNode.left != null) {
                q.add(new Pair<>(frontNode.left, hd - 1));
            }
            if (frontNode.right != null) {
                q.add(new Pair<>(frontNode.right, hd + 1));
            }
        }

        // Collect the bottom view values from the map
        ans.addAll(bottomNode.values());
        return ans;
    }

}

public class ViewsofTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nodes[] = new int[n];

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = sc.nextInt();
        }
        BinaryTree bt = new BinaryTree();

        Node root = bt.buildLevelorderTrav(nodes);
        bt.printLevelWiseTestpad(root);

        Solution s = new Solution();

        // ArrayList<Integer> res = s.leftviewoftree(root);
        // System.out.println(res);

        // ArrayList<Integer> res2 = s.rightviewoftree(root);
        // System.out.println(res2);

        List<Integer> res3 = s.topView(root);
        System.out.println(res3);

        List<Integer> res4= s.verticalOrder(root);
        System.out.println(res4);

        List<Integer> res5=s.bottomView(root);
        System.out.println(res5);



    }
}
