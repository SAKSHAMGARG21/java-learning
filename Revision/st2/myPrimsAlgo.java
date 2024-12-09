
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

class Pair implements Comparable<Pair> {
    public int node;
    public int cost;

    public Pair(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }

    public int compareTo(Pair p) {
        return this.cost - p.cost; // Sort in ascending order
        // return p.cost - this.cost; // Sort in descending order
    }
}

class Solution {
    public void MstPrimsAlgo(ArrayList<Edge> graph[], int src, int n) {

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        boolean[] vist = new boolean[n];

        pq.add(new Pair(0, 0));

        int msCost = 0;
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int node = p.node;

            if (!vist[node]) {
                vist[node] = true;
                msCost += p.cost;

                for (int i = 0; i < graph[node].size(); i++) {
                    Edge eg = graph[node].get(i);
                    if (!vist[eg.dest]) {
                        pq.add(new Pair(eg.dest, eg.wt));
                    }
                }
            }
        }

        System.out.println(msCost);
    }
}

public class myPrimsAlgo {
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

        // int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];

        // cg.graphcreation(graph);
        cg.graphCreationWithLoop(graph, arr);

        // for (int i = 0; i < graph.length; i++) {
        // System.out.print(i + "-> ");
        // for (int j = 0; j < graph[i].size(); j++) {
        // Edge e = graph[i].get(j);
        // System.out.print("(" + e.wt + ")" + e.dest + " ");
        // }
        // System.out.println();
        // }

        Solution sb = new Solution();
        sb.MstPrimsAlgo(graph, 0, v);

    }
}
