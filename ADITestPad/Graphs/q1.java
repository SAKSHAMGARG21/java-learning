
import java.util.*;

class Solution {

    // Method to find the minimum number of edges using BFS
    public static int number_of_edges(int n) {
        if (n == 1)
            return 0;

        // BFS initialization
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        int[] distance = new int[n + 1];

        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int[] nextVertices = { current + 1, current * 3 };

            for (int next : nextVertices) {
                if (next <= n && !visited[next]) {
                    visited[next] = true;
                    distance[next] = distance[current] + 1;
                    queue.add(next);

                    // Early exit if we reach the target vertex
                    if (next == n) {
                        return distance[next];
                    }
                }
            }
        }
        return -1; // If no path is found (though theoretically there should always be one)
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println(Solution.number_of_edges(n));
        }
    }
}
