
import java.util.*;

// time complecxity is O(V+E) of graphs bfs
class Edge {
    int src;
    int dest;
    int weight;

    public Edge(int s, int d) {
        this.src = s;
        this.dest = d;
    }
}

class createGraph {
    public void graphcreation(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }
}

// 0-> 1 2
// 1-> 0 3
// 2-> 0 4
// 3-> 1 4 5
// 4-> 2 3 5
// 5-> 3 4 6
// 6-> 5
class Solution {
    public void printPaths(ArrayList<Edge> graph[], int curr, String path, boolean[] vist, int target) {
        if (curr == target) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge eg = graph[curr].get(i);
            if (!vist[eg.dest]) {
                vist[curr] = true;
                printPaths(graph, eg.dest, path + eg.dest, vist, target);
                vist[curr] = false;
            }
        }
    }

    public int countPaths(ArrayList<Edge> graph[], int curr, boolean[] vist, int target) {
        if (curr == target) {
            return 1;
        }
        int totalpaths = 0;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge eg = graph[curr].get(i);
            if (!vist[eg.dest]) {
                vist[curr] = true;
                totalpaths += countPaths(graph, eg.dest, vist, target);
                vist[curr] = false;
            }
        }

        return totalpaths;
    }
}

public class q5sourcetoDestination {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // int v=sc.nextInt();
        // int e=sc.nextInt();

        // 1 --- 3
        // / | \
        // 0 | 5 -- 6
        // \ | /
        // 2 ---- 4
        int v = 7;
        ArrayList<Edge> gh[] = new ArrayList[v];

        createGraph cgh = new createGraph();
        cgh.graphcreation(gh);

        boolean vist[] = new boolean[v];
        Arrays.fill(vist, false);
        Solution sb = new Solution();
        int target = 5;
        int src = 0;
        sb.printPaths(gh, src, "0", vist, target);
        // System.out.println();

        int cPaths=sb.countPaths(gh, src, vist, target);
        System.out.println(cPaths);
    }
}
