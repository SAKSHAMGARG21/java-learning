// // 0-> 2
// // 1-> 2 3
// // 2-> 0 1 3
// // 3-> 1 2

import java.util.*;

class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

class createGraph {
    public void graphcreation(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1)); // Changed to create a cycle
    }
}

class solution {
    public boolean isCycleDirected(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                if (isCycleDirected(graph, vis, e.dest, rec)) {
                    return true;
                }
            } else if (rec[e.dest]) {
                return true; // Cycle detected
            }
        }

        rec[curr] = false; // Backtrack
        return false;
    }
}

public class q6detectCycleInDirected {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph cg = new createGraph();
        cg.graphcreation(graph);

        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + "-> ");
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.print(e.dest + " ");
            }
            System.out.println();
        }

        solution sb = new solution();
        boolean vis[] = new boolean[v];
        boolean rec[] = new boolean[v];
        boolean hasCycle = false;

        for (int j = 0; j < v; j++) {
            if (!vis[j]) {
                if (sb.isCycleDirected(graph, vis, j, rec)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        System.out.println("Cycle detected: " + hasCycle);
    }
}