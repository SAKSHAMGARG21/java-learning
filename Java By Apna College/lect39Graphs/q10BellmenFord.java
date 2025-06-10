
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
    public int[][] takeinput() {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int[][] arr = new int[v][3];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public void printGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + "-> ");
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.print("(" + e.wt + ")" + e.dest + " ");
            }
            System.out.println();
        }
    }

    public void graphcreation(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // graph[0].add(new Edge(0, 1, 2));
        // graph[0].add(new Edge(0, 2, 4));

        // graph[1].add(new Edge(1, 2, -4));

        // graph[2].add(new Edge(2, 3, 2));

        // graph[3].add(new Edge(3, 4, 4));

        // graph[4].add(new Edge(4, 1, -1));
        // negative cycle 
        // graph[4].add(new Edge(4, 1, -10));

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

        

    }

    public void graphCreationWithLoop(ArrayList<Edge> graph[], int[][] arr) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < arr.length; i++) {
            graph[arr[i][0]].add(new Edge(arr[i][0], arr[i][1], arr[i][2]));
        }
    }
}

class Pair {
    public int node;
    public int dist;

    public Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

class Solution {
    public void Bellmenford(ArrayList<Edge> graph[], int src, int n) {
        int dis[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src)
                dis[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                for (Edge e:graph[j]) {
                    int u = e.src;
                    int v = e.dest;
                    if (dis[u] != Integer.MAX_VALUE && dis[u] + e.wt < dis[v]) { // relaxation
                        dis[v] = dis[u] + e.wt;
                    }
                }
            }
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < graph[j].size(); k++) {
                Edge e = graph[j].get(k);
                int u = e.src;
                int v = e.dest;
                if (dis[u] != Integer.MAX_VALUE && dis[u] + e.wt < dis[v]) { // relaxation
                    System.out.println("negative Cycle occured");
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(dis[i] + " ");
        }
        System.out.println();
    }
}

public class q10BellmenFord {
    public static void main(String[] args) {
        createGraph cg = new createGraph();

        // Scanner sc = new Scanner(System.in);
        // int v = sc.nextInt();
        // int e = sc.nextInt();
        // int[][] arr = new int[e][3];
        // for (int i = 0; i < e; i++) {
        // for (int j = 0; j < 3; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // ArrayList<Edge> graph[] = new ArrayList[v];
        // cg.graphCreationWithLoop(graph, arr);

        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        cg.graphcreation(graph);

        cg.printGraph(graph);

        Solution sb = new Solution();
        sb.Bellmenford(graph, 0, v);

    }
}
