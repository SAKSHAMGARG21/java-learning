import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adj;

    public Graph() {
        adj = new HashMap<>();
    }

    public void edge(int u, int v, int dic) {
        adj.putIfAbsent(u, new ArrayList<>());
        adj.get(u).add(v);
        if (dic == 0) {
            adj.putIfAbsent(v, new ArrayList<>());
            adj.get(v).add(u);
        }
    }

    public void print() {
        for (Map.Entry<Integer, List<Integer>> entry : adj.entrySet()) {
            System.out.print(entry.getKey() + "->");
            for (int neighbor : entry.getValue()) {
                System.out.print(neighbor + ",");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> getEdges(int n) {
        List<List<Integer>> edges = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for (Map.Entry<Integer, List<Integer>> entry : adj.entrySet()) {
            for (int neighbor : entry.getValue()) {
                edges.get(entry.getKey()).add(neighbor);
            }
        }
        return edges;
    }
}

public class bfsTrav {
    public static void bfsFun(List<List<Integer>> edges, boolean[] visited, List<Integer> ans) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true; // Using boolean value to represent visited status

        while (!q.isEmpty()) {
            int frontNode = q.poll();

            // store the ans
            ans.add(frontNode);

            // traverse all the neighbours of Nodes
            for (int i : edges.get(frontNode)) {
                if (!visited[i]) {
                    visited[i] = true; // Mark the neighbor as visited
                    q.add(i);
                }
            }
        }
    }

    public static List<Integer> bfsTraversal(int n, List<List<Integer>> edges) {
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[n];

        bfsFun(edges, visited, ans);

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Graph G = new Graph();
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            G.edge(u, v, 0);
        }

        G.print();

        List<List<Integer>> edges = G.getEdges(n);
        List<Integer> traversal = bfsTraversal(n, edges);
        System.out.print("BFS Traversal: ");
        for (int node : traversal) {
            System.out.print(node + " ");
        }
        System.out.println();

        scanner.close();
    }
}