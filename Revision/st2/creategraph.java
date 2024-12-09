import java.util.*;

class Edge {
    int dest;
    int src;

    public Edge(int s, int d) {
        src = s;
        dest = d;
    }
}

class GraphwithHashmap {
    public Map<Integer, List<Integer>> adj;

    public GraphwithHashmap() {
        this.adj = new HashMap<Integer, List<Integer>>();
    }

    public void addVertex(int v) {
        adj.putIfAbsent(v, new ArrayList<Integer>());
    }

    public void addEdge(int s, int d) {
        adj.get(s).add(d);
    }

    public void printgh() {

        for (Map.Entry<Integer, List<Integer>> entry : adj.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Integer i : entry.getValue()) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

class GraphwithArrayList {

    public void creategh(ArrayList<Edge>[] gh, int[][] arr, int v, int e) {

        for (int i = 0; i < v; i++) {
            gh[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < e; i++) {
            gh[arr[i][0]].add(new Edge(arr[i][0], arr[i][1]));
        }
    }

    public void printgh(ArrayList<Edge>[] gh) {

        for (int i = 0; i < gh.length; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < gh[i].size(); j++) {
                System.out.print(gh[i].get(j).dest + " ");
            }
            System.out.println();
        }
    }

    // public void Bfs(ArrayList<Edge>[] gh) {

    // // Queue<>

    // }

    // public void Dfs() {

    // }
}

public class creategraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        int[][] arr = new int[e][2];
        for (int i = 0; i < e; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        GraphwithArrayList g = new GraphwithArrayList();
        ArrayList<Edge>[] gh = new ArrayList[v];
        g.creategh(gh, arr, v, e);
        // g.printgh(gh);

        // GraphwithHashmap g = new GraphwithHashmap();

        // for (int i = 0; i < v; i++) {
        // g.addVertex(i);
        // }
        // for (int i = 0; i < e; i++) {
        // int s = sc.nextInt();
        // int d = sc.nextInt();
        // g.addEdge(s, d);
        // }
        // g.printgh();

    }
}
