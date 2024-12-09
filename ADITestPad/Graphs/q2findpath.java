import java.util.*;

class Edge {
    int src;
    int dest;

    public Edge(int s, int d) {
        src = s;
        dest = d;
    }
}

class Graph {
    static void createGraph(ArrayList<Edge> gh[], int[][] arr, int e) {

        for (int i = 0; i < gh.length; i++) {
            gh[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < e; i++) {
            gh[arr[i][0]].add(new Edge(arr[i][0], arr[i][1]));
        }
    }
}

class Sol {
    public boolean findPath(ArrayList<Edge> gh[], int s, int d, boolean[] visited) {
        // Base case: if source and destination are the same
        if (s == d) {
            return true;
        }

        // Mark the current node as visited
        visited[s] = true;

        // Recur for all the vertices adjacent to this vertex
        for (Edge edge : gh[s]) {
            if (!visited[edge.dest] && findPath(gh, edge.dest, d, visited)) {
                return true;
            }
        }

        return false;
    }
}

public class q2findpath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        int[][] arr = new int[e][2];
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt();
        int d = sc.nextInt();

        ArrayList<Edge> gh[] = new ArrayList[v];
        Graph.createGraph(gh, arr, e);

        // Print the graph
        for (int i = 0; i < v; i++) {
            System.out.print(i + "-> ");
            for (int j = 0; j < gh[i].size(); j++) {
                Edge eg = gh[i].get(j);
                System.out.print(eg.dest + " ");
            }
            System.out.println();
        }

        // Find path from source to destination
        Sol sol = new Sol();
        boolean[] visited = new boolean[v];
        boolean pathExists = sol.findPath(gh, s, d, visited);

        if (pathExists) {
            System.out.println("Path exists from " + s + " to " + d);
        } else {
            System.out.println("No path exists from " + s + " to " + d);
        }
    }
}

// import java.util.*;

// class Edge {
// int src, dest;

// Edge(int s, int d) {
// src = s;
// dest = d;
// }
// }

// class Graph {
// List<List<Edge>> adjList;

// Graph(int V) {
// adjList = new ArrayList<>(V);
// for (int i = 0; i < V; i++) {
// adjList.add(new ArrayList<>());
// }
// }

// void addEdge(int u, int v) {
// adjList.get(u).add(new Edge(u, v));
// }

// boolean findPath(int src, int dest, boolean[] visited) {
// if (src == dest) {
// return true;
// }

// visited[src] = true;

// for (Edge edge : adjList.get(src)) {
// if (!visited[edge.dest] && findPath(edge.dest, dest, visited)) {
// return true;
// }
// }

// return false;
// }
// }

// public class q2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int V = sc.nextInt();
// int E = sc.nextInt();

// Graph graph = new Graph(V);

// for (int i = 0; i < E; i++) {
// int u = sc.nextInt();
// int v = sc.nextInt();
// graph.addEdge(u, v);
// }

// int src = sc.nextInt();
// int dest = sc.nextInt();

// boolean[] visited = new boolean[V];
// boolean pathExists = graph.findPath(src, dest, visited);

// if (pathExists) {
// System.out.println("YES");
// } else {
// System.out.println("NO");
// }

// sc.close();
// }
// }
