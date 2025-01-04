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

class BinaryTree {
    int idx = -1;

    public Node buildTree(int[] arr) {
        idx++;
        if (arr[idx] == -1) {
            return null;
        }

        Node root = new Node(arr[idx]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);
        return root;
    }

    public Node buildTree2(int[] arr) {
        int n = arr.length;
        if (n == 0 || arr[0] == -1)
            return null;

        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.add(root);
        int idx = 1;
        while (idx < n && !q.isEmpty()) {
            Node temp = q.poll();
            if (idx < n && arr[idx] != -1) {
                temp.left = new Node(arr[idx++]);
                q.add(temp.left);
            }
            if (idx < n && arr[idx] != -1) {
                temp.right = new Node(arr[idx++]);
                q.add(temp.right);
            }
        }
        return root;
    }

    public void printBt(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                System.out.print(temp.data);
                if (i < size - 1)
                    System.out.print(" ");
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            System.out.println();
        }
    }
}

class solution {

    public void preordertrav(Node root) {

        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preordertrav(root.left);
        preordertrav(root.right);
    }

    public void inordertrav(Node root) {

        if (root == null) {
            return;
        }
        preordertrav(root.left);
        System.out.println(root.data);
        preordertrav(root.right);
    }

    public void postordertrav(Node root) {

        if (root == null) {
            return;
        }
        preordertrav(root.left);
        preordertrav(root.right);
        System.out.println(root.data);
    }

    public int heightoftree(Node root) {
        if (root == null) {
            return 0;
        }

        int left = heightoftree(root.left) + 1;
        int right = heightoftree(root.right) + 1;

        int mx = Math.max(left, right);
        return mx;
    }

    public int countleafnodes(Node root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }
        int left = countleafnodes(root.left);
        int right = countleafnodes(root.right);

        return left + right;
    }

    public int countTotalnodes(Node root) {
        if (root == null) {
            return 0;
        }

        int left = countTotalnodes(root.left);
        int right = countTotalnodes(root.right);

        return left + right + 1;
    }

    public int sumofNodes(Node root, int sum) {
        if (root == null) {
            return 0;
        }

        sum = root.data;
        int left = sumofNodes(root.left, sum);
        int right = sumofNodes(root.right, sum);

        return sum + left + right;
    }

    public int diameteroftree(Node root) {
        if (root == null) {
            return 0;
        }

        int h1 = diameteroftree(root.left);
        int h2 = diameteroftree(root.right);
        int h3 = heightoftree(root.left) + heightoftree(root.right) + 1;
        return Math.max(h1, Math.max(h2, h3));
    }

    public void zigzagtrav(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();

        boolean flag = true;
        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                int idx = flag ? i : size - i - 1;
                arr[idx] = temp.data;
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            flag = !flag;
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i]);
                System.out.print((i < size - 1) ? " " : "");
            }
            System.out.println();
        }
    }

    public int sumofkthnode(Node root, int k) {
        if (root == null)
            return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        int level = 1;
        int flag=0;
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                Node temp = q.poll();
                if (level == k) {
                    sum += temp.data;
                    flag=1;
                } else {
                    if (root.left != null)
                        q.add(root.left);
                    if (root.right != null)
                        q.add(root.right);
                }
            }
            if (flag==1) break;
            level++;
        }
        return sum;
    }

    // advans questions

    // blodline sumoflongestRoottoLeafPath

    public void blodlinehelper(Node root, int mxlen ,int mxsum,int sum,int len){
        if (root==null){
            if (len>mxlen){
                mxlen=len;
                mxsum=sum;
            }else if (len==mxlen){
                mxsum=Math.max(sum,mxsum);
            }
            return ;
        }

        sum+=root.data;
        blodlinehelper(root.left, mxlen, mxsum, sum, len+1);
        blodlinehelper(root.right, mxlen, mxsum, sum, len+1);
    }
    public int blodlinemaxsum(Node root){
        if (root==null) return 0;
        int mxsum=Integer.MIN_VALUE;
        blodlinehelper(root, 0, mxsum, 0, 0, 0);
        return mxsum;
    }


    // sumtree()



}

public class createBinaryTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree2(a);
        bt.printBt(root);

        solution sb = new solution();
        int hig = sb.heightoftree(root);
        System.out.println(hig);

        int res = sb.countleafnodes(root);
        System.out.println("no of leaf nodes");
        System.out.println(res);

        int totalnodes = sb.countTotalnodes(root);
        System.out.println("Total nodes of bt -> " + totalnodes);

        int sumofnodes = sb.sumofNodes(root, 0);
        System.out.println("sum of nodes -> " + sumofnodes);

        int diameter = sb.diameteroftree(root);
        System.out.println("diameter of tree ->" + diameter);

        System.out.println("zigzag traversal");
        sb.zigzagtrav(root);

        System.out.println("sum of the kth level");
        System.out.println(sb.sumofkthnode(root, 2));


    }
}