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

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }
}

class solution {
    public boolean isCycleundirect(ArrayList<Edge> graph[], boolean[] vis, int curr, int par) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge eg = graph[curr].get(i);
            if (vis[eg.dest] && eg.dest != par) {
                return true;
            } else if (!vis[eg.dest]) {
                if(isCycleundirect(graph, vis, eg.dest, curr)){
                    return true;
                }
            }
        }
        return false;
    }
}

public class q8isCycleinUndirected {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph cg = new createGraph();
        cg.graphcreation(graph);

        solution sb = new solution();
        boolean[] vis = new boolean[v];
        Arrays.fill(vis,false);
        System.out.println(sb.isCycleundirect(graph, vis, 0, -1));

    }
}

// 0-> 2
// 1-> 2 3
// 2-> 0 1 3
// 3-> 1 2

// # 0 1 2 3
// 0 0 0 1 0
// 1 0 0 1 1
// 2 1 1 0 1
// 3 0 1 1 0