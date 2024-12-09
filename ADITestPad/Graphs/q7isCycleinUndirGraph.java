import java.util.*;

class CreateGraph {
    public Map<Integer, List<Integer>> adj;

    public CreateGraph() {
        this.adj = new HashMap<>();
    }

    public void addVertex(int v) {
        adj.putIfAbsent(v, new ArrayList<>());
    }

    public void graphCreation(int src, int dest) {
        adj.get(src).add(dest);
        adj.get(dest).add(src); // Adding bidirectional edges for undirected graph
    }
}

class Solution extends CreateGraph {

    public void printgh() {
        for (Map.Entry<Integer, List<Integer>> entry : adj.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (Integer i : entry.getValue()) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public boolean isCycleUndirected(boolean[] vis, int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < adj.get(curr).size(); i++) {
            int adjNode = adj.get(curr).get(i);
            if (!vis[adjNode]) {
                if (isCycleUndirected(vis, adjNode, curr)) {
                    return true;
                }
            } else if (adjNode != par) {
                return true;
            }
        }
        return false;
    }
}

public class q7isCycleinUndirGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        CreateGraph cg = new CreateGraph();
        for (int i = 0; i < v; i++) {
            cg.addVertex(i);
        }

        for (int i = 0; i < e; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            cg.graphCreation(src, dest);
        }

        Solution sb = new Solution();
        sb.adj = cg.adj;
        boolean[] vis = new boolean[v];
        boolean hasCycle = false;

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (sb.isCycleUndirected(vis, i, -1)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        sb.printgh();

        if (hasCycle) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}