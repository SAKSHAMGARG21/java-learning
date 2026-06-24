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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
}

class solution {
    public void solve(ArrayList<Edge> graph[], int curr, boolean[] vis, Stack<Integer> stack) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge eg = graph[curr].get(i);
            if (!vis[eg.dest]) {
                solve(graph, eg.dest, vis, stack);
            }
        }

        stack.push(curr);
    }

    public void topSort(ArrayList<Edge> graph[], int curr) {

        Stack<Integer> stack = new Stack<Integer>();
        boolean[] vist = new boolean[graph.length];
        Arrays.fill(vist,false);
        for (int i = 0; i < graph.length; i++) {
            if (!vist[i]) {
                solve(graph, i, vist, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

public class q7topSort {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph cg = new createGraph();
        cg.graphcreation(graph);

        solution sb= new solution();
        sb.topSort(graph, 0);

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