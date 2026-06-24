import java.util.*;

// Define the Edge class with weight
class Edge {
    int dest;
    int weight;

    public Edge(int d, int w) {
        this.dest = d;
        this.weight = w;
    }
}

class GraphwithHashmap {
    public Map<Integer, List<Edge>> adj;

    public GraphwithHashmap() {
        this.adj = new HashMap<Integer, List<Edge>>();
    }

    public void addVertex(int v) {
        adj.putIfAbsent(v, new ArrayList<Edge>());
    }

    public void addEdge(int s, int d, int w) {
        adj.get(s).add(new Edge(d, w));
    }

    public void printgh() {
        for (Map.Entry<Integer, List<Edge>> entry : adj.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Edge e : entry.getValue()) {
                System.out.print("[" + e.dest + ", " + e.weight + "] ");
            }
            System.out.println();
        }
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
    }

}

class sol extends GraphwithHashmap {
    public int dijastraalgo() {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dis[] = new int[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if (i != 0)
                dis[i] = Integer.MAX_VALUE;
        }
        boolean vis[] = new boolean[adj.size()];
        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;
                for (Edge e : adj.get(curr.node)) {
                    int u = curr.node;
                    int v = e.dest;
                    if (dis[u] + e.weight < dis[v]) { // relaxation
                        dis[v] = dis[u] + e.weight;
                    }
                    pq.add(new Pair(v, dis[v]));
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < adj.size(); i++) {
            sum += dis[i];
        }
        for (int i = 0; i < adj.size(); i++) {
            System.out.println(dis[i] + " ");
        }
        return sum;
    }
}

public class createweightgraphusingmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        GraphwithHashmap g = new GraphwithHashmap();

        for (int i = 0; i < v; i++) {
            g.addVertex(i);
        }

        for (int i = 0; i < e; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            g.addEdge(s, d, w);
        }

        // g.printgh();

        sol s = new sol();
        s.adj = g.adj;
        System.out.println(s.dijastraalgo());
    }
}
