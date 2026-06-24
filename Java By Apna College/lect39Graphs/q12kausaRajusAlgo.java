
import java.util.*;

class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
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

class createGraph {
    public int[][] takeinput() {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] arr = new int[e][3];
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public void printGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + "-> ");
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.print(e.dest);
            }
            System.out.println();
        }
    }

    public void graphcreation(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

    }

    public void graphCreationWithLoop(ArrayList<Edge> graph[], int[][] arr) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < arr.length; i++) {
            graph[arr[i][0]].add(new Edge(arr[i][0], arr[i][1]));
        }
    }

}

class Solution {
    public void topSort(ArrayList<Edge> graph[], int curr, boolean[] vist, Stack<Integer> st) {
        vist[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge eg = graph[curr].get(i);
            if (!vist[eg.dest]) {
                topSort(graph, eg.dest, vist, st);
            }
        }

        st.push(curr);
    }

    public void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis) {
        vis[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge eg = graph[curr].get(i);
            if (!vis[eg.dest]) {
                dfs(graph, eg.dest, vis);
            }
        }
    }

    public void kosaRaju(ArrayList<Edge> graph[], int n) {
        Stack<Integer> st = new Stack<>();
        boolean[] vist = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vist[i]) {
                topSort(graph, i, vist, st);
            }
        }

        ArrayList<Edge> transpose[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            vist[i] = false;
            transpose[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge eg = graph[i].get(j);
                transpose[eg.dest].add(new Edge(eg.dest, eg.src));
            }
        }

        while (!st.isEmpty()) {
            int i = st.pop();
            if (!vist[i]) {
                dfs(transpose, i, vist);
                System.out.println();
            }
        }

    }
}

public class q12kausaRajusAlgo {
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
        ArrayList<Edge> graph[] = new ArrayList[v];
        cg.graphCreationWithLoop(graph, arr);
        Solution sb = new Solution();
        sb.kosaRaju(graph, v);

        // int v = 5;
        // ArrayList<Edge> graph[] = new ArrayList[v];
        // cg.graphcreation(graph);
        // Solution sb = new Solution();
        // sb.kosaRaju(graph, v);

        // cg.printGraph(graph);

    }
}
