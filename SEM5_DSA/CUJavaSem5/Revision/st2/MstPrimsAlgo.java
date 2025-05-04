import java.util.*;

@SuppressWarnings("unchecked")
class Result {
    public int mst_using_prim(int N, int E, int[][] edges) {
        // Write your code here
        List<int[]>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        // Step 2: Populate the adjacency list with edges
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph[u].add(new int[] { v, w });
            graph[v].add(new int[] { u, w });
        }

        // Step 3: Priority Queue to store edges in the format {vertex, weight}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        // Step 4: Track visited vertices
        boolean[] visited = new boolean[N];

        // Step 5: Start with vertex 0 (or any vertex), add its neighbors to the
        // priority queue
        pq.add(new int[] { 0, 0 }); // {vertex, weight}

        int mstWeight = 0;

        // Step 6: While the priority queue has edges to process
        while (!pq.isEmpty()) {
            // Get the edge with the smallest weight
            int[] current = pq.poll();
            int node = current[0], weight = current[1];

            // Skip if the node has already been visited
            if (visited[node])
                continue;

            // Mark the node as visited
            visited[node] = true;

            // Add the weight of the edge to MST weight
            mstWeight += weight;

            // Add all unvisited neighbors to the priority queue
            for (int[] neighbor : graph[node]) {
                int neighborNode = neighbor[0], neighborWeight = neighbor[1];
                if (!visited[neighborNode]) {
                    pq.add(new int[] { neighborNode, neighborWeight });
                }
            }
        }

        return mstWeight;
    }
}

class MstPrimsAlgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numVertices = scanner.nextInt();
        int numEdges = scanner.nextInt();

        int[][] edges = new int[numEdges][3];
        for (int e = 0; e < numEdges; ++e) {
            edges[e][0] = scanner.nextInt(); // Vertex 1
            edges[e][1] = scanner.nextInt(); // Vertex 2
            edges[e][2] = scanner.nextInt(); // Weight
        }

        Result graph = new Result();
        int ans = graph.mst_using_prim(numVertices, numEdges, edges);
        System.out.print(ans);

        scanner.close();
    }
}