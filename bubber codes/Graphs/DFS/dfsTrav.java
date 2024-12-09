import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adj;

    public Graph() {
        adj = new HashMap<>();
    }

    public void addEdge(int u, int v) {
        adj.putIfAbsent(u, new ArrayList<>());
        adj.get(u).add(v);
        adj.putIfAbsent(v, new ArrayList<>());
        adj.get(v).add(u);
    }

    public Map<Integer, List<Integer>> getAdjacencyList() {
        return adj;
    }
}

public class dfsTrav {
    public static void dfs(int node, Map<Integer, List<Integer>> adj, boolean[] visited, List<Integer> component) {
        component.add(node);
        visited[node] = true;

        for (int neighbor : adj.getOrDefault(node, new ArrayList<>())) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, component);
            }
        }
    }

    public static List<List<Integer>> depthFirstSearch(int V, int E, List<List<Integer>> edges) {
        Graph graph = new Graph();
        for (List<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            graph.addEdge(u, v);
        }

        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, graph.getAdjacencyList(), visited, component);
                result.add(component);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of vertices
        int m = scanner.nextInt(); // Number of edges

        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            edges.add(Arrays.asList(u, v));
        }

        List<List<Integer>> traversal = depthFirstSearch(n, m, edges);
        System.out.println("DFS Traversal:");
        for (List<Integer> component : traversal) {
            for (int node : component) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
