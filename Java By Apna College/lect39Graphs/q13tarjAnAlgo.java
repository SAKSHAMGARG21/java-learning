import java.util.*;

class Edge {
    int src;
    int dest;

    Edge(int x, int y) {
        this.src = x;
        this.dest = y;
    }
}

class Graph {
    public void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));

    }

}

class solution {
    public void dfs(ArrayList<Edge> graph[], int curr, boolean vist[], int n, int[] dt, int[] low, int time, int par) {
        vist[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (e.dest == par) {
                continue;
            } else if (!vist[e.dest]) {
                dfs(graph, e.dest, vist, n, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[e.dest]);
                if (dt[curr] < low[e.dest]) {
                    System.out.println("Bridge b/w " + curr + " ---- " + e.dest);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[e.dest]);
            }
        }
    }

    public void tarjanAlgo(ArrayList<Edge> graph[], int n) {
        int[] dt = new int[n];
        int[] low = new int[n];
        int time = 0;
        boolean[] vist = new boolean[n];

        for (int i = 0; i < vist.length; i++) {
            if (!vist[i]) {
                dfs(graph, i, vist, n, dt, low, time, -1);
            }
        }
    }
}

// tarjan algo is use for finding the bridge b/w two nodes in the graph
public class q13tarjAnAlgo {
    public static void main(String[] args) {
        solution sb = new solution();
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        Graph g = new Graph();
        g.createGraph(graph);
        sb.tarjanAlgo(graph, v);
    }
}
