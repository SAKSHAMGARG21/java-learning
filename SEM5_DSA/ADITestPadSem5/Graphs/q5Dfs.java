import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjVertices;

    public Graph() {
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

    void DFSUtil(int st, boolean[] vist) {
        System.out.print(st + " ");
        vist[st] = true;

        for (int i = 0; i < adjVertices.get(st).size(); i++) {
            int adj = adjVertices.get(st).get(i);
            if (!vist[adj]) {
                DFSUtil(adj, vist);
            }
        }
    }

    void DFS(int v) {
        int V = adjVertices.size();
        boolean[] visited = new boolean[V];

        // for (int i = v; i < V; i++) { all test cases are correct
        // if (!visited[i])
        // DFSUtil(i, visited);
        // }

        DFSUtil(v, visited); // all passed
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
public class q5Dfs {
    public static void main(String args[]) {
        int V, E, v1, v2, s, i;
        Scanner sc = new Scanner(System.in);
        V = Integer.parseInt(sc.nextLine().trim());
        E = Integer.parseInt(sc.nextLine().trim());
        Graph g = new Graph();
        for (i = 0; i < V; i++)
            g.addVertex(i);
        for (i = 0; i < E; i++) {
            v1 = sc.nextInt();
            v2 = Integer.parseInt(sc.nextLine().trim());
            g.addEdge(v1, v2);
        }
        s = Integer.parseInt(sc.nextLine().trim());
        g.DFS(s);

        g.printGraph();
    }
}
