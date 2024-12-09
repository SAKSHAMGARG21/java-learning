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

    public void dfs(ArrayList<Edge> graph[], int curr, boolean[] vist) {
        System.out.print(curr + " ");

        vist[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge eg = graph[curr].get(i);
            if (!vist[eg.dest])
                dfs(graph, eg.dest, vist);
        }
    }
}

public class q4Dfs {
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
        @SuppressWarnings("unchecked")
        ArrayList<Edge> gh[] = new ArrayList[v];

        createGraph cgh = new createGraph();
        cgh.graphcreation(gh);

        boolean vist[] = new boolean[v];
        Arrays.fill(vist, false);
        Solution sb = new Solution();
        // this approach is for disconnected graphs or where two components
        for (int i = 0; i < vist.length; i++) {
            if (vist[i] == false)
                sb.dfs(gh, 0, vist);
        }
        System.out.println();
    }
}