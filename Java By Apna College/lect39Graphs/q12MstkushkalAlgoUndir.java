import java.util.*;

class Edge implements Comparable<Edge> {
    int src;
    int dest;
    int wt;

    public Edge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }

    @Override
    public int compareTo(Edge compareEdge) {
        return this.wt - compareEdge.wt;
    }
}

class createGraph {
    public void graphcreation(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    public void graphCreationWithLoop(ArrayList<Edge> graph[], int[][] arr) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < arr.length; i++) {
            graph[arr[i][0]].add(new Edge(arr[i][0], arr[i][1], arr[i][2]));
            graph[arr[i][1]].add(new Edge(arr[i][1], arr[i][0], arr[i][2]));
        }
    }
}

class Solution {
    public static int V, E;

    public int find(int parent[], int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    public void union(int parent[], int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        if (xset != yset) {
            parent[xset] = yset;
        }
    }

    public int kruskalMST(ArrayList<Edge> graph[]) {
        ArrayList<Edge> allEdges = new ArrayList<Edge>();
        for (ArrayList<Edge> edges : graph) {
            allEdges.addAll(edges);
        }

        Collections.sort(allEdges);

        int parent[] = new int[V];
        Arrays.fill(parent, -1);

        int mst_weight = 0;
        for (Edge edge : allEdges) {
            int x = find(parent, edge.src);
            int y = find(parent, edge.dest);

            if (x != y) {
                mst_weight += edge.wt;
                union(parent, x, y);
            }
        }

        return mst_weight;
    }
}

public class q12MstkushkalAlgoUndir {
    public static void main(String[] args) {
        createGraph cg = new createGraph();

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] arr = new int[e][3];
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Solution.V = v;
        Solution.E = e;
        ArrayList<Edge> graph[] = new ArrayList[v];
        cg.graphCreationWithLoop(graph, arr);

        Solution sol = new Solution();
        System.out.println("Minimum cost spanning tree: " + sol.kruskalMST(graph));
    }
}
