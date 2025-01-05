import java.util.*;

class Edge {
    int src;
    int dest;
    int wt;

    public Edge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }
}

class createGraph {
    public void graphcreation(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }
}

class Pair implements Comparable<Pair> {
    public int node;
    public int dist;

    public Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }

    public int compareTo(Pair p) {
        return this.dist - p.dist; // Sort in ascending order
        // return p.dist - this.dist; // Sort in descending order
    }
}

class Solution {
    public void DijastraAlgo(ArrayList<Edge> graph[], int src, int n) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        int dis[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src)
                dis[i] = Integer.MAX_VALUE;
        }

        boolean vis[] = new boolean[n];

        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (dis[u] + e.wt < dis[v]) { // relaxation
                        dis[v] = dis[u] + e.wt;
                    }
                    pq.add(new Pair(v, dis[v]));
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(dis[i] + " ");
        }
        System.out.println();
    }
}

public class q9DijastraAlgo {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph cg = new createGraph();
        cg.graphcreation(graph);

        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + "-> ");
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.print("(" + e.wt + ")" + e.dest + " ");
            }
            System.out.println();
        }

        Solution sb = new Solution();
        sb.DijastraAlgo(graph, 0, v);

    }
}