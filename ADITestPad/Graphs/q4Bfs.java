import java.util.*;

class Graph {
    private int V;
    private Map<Integer, List<Integer>> adjVertices;

    public Graph(int V) {
        this.V = V;
        this.adjVertices = new HashMap<Integer, List<Integer>>();
    }

    public void addVertex(int vertex) {
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(int src, int dest) {
        adjVertices.get(src).add(dest);
    }

    void printGraph() {

        for (Map.Entry<Integer, List<Integer>> entry : adjVertices.entrySet()) {
            System.out.print("Vertex " + entry.getKey() + " is connected to: ");
            // System.out.println(entry.getValue().toString());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.print(entry.getValue().get(i) + " ");
            }
            System.out.println();
        }
    }

    void BFS(int v) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.add(v);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int i = 0; i < adjVertices.get(vertex).size(); i++) {
                int adjVertex = adjVertices.get(vertex).get(i);
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                }
            }
        }
    }
}
// 4
// 5
// 0 1
// 0 2
// 1 2
// 2 0
// 2 3
// 2
public class q4Bfs {
    public static void main(String args[]) {
        int V, E, v1, v2, s, i;
        Scanner sc = new Scanner(System.in);
        V = Integer.parseInt(sc.nextLine().trim());
        E = Integer.parseInt(sc.nextLine().trim());
        Graph g = new Graph(V);
        for (i = 0; i < V; i++)
            g.addVertex(i);
        for (i = 0; i < E; i++) {
            v1 = sc.nextInt();
            v2 = Integer.parseInt(sc.nextLine().trim());
            g.addEdge(v1, v2);
        }
        s = Integer.parseInt(sc.nextLine().trim());
        g.BFS(s);

        // g.printGraph();
    }
}
