import java.util.*;

class Tuple {
    int dist;
    int first;
    int sec;

    public Tuple(int d, int f, int s) {
        dist = d;
        first = f;
        sec = s;
    }
}

class Result {
    static int shortestPath(int mat[][], int srcR, int srcC, int destR, int destC, int m, int n) {
        if (mat[srcR][srcC] == 0 || mat[destR][destC] == 0) {
            return -1;
        }
        if (srcR == destR && srcC == destC)
            return 0;

        int[][] dis = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dis[i][j] = Integer.MAX_VALUE;
            }
        }

        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(0, srcR, srcC));
        dis[srcR][srcC] = 0;

        while (!q.isEmpty()) {
            Tuple t = q.remove();
            int f = t.dist;
            int r = t.first;
            int c = t.sec;

            int[] dr = { 1, 0, -1, 0 };
            int[] dc = { 0, 1, 0, -1 };

            for (int i = 0; i < 4; i++) {
                int newr = r + dr[i];
                int newc = c + dc[i];

                if (newr >= 0 && newr < m && newc >= 0 && newc < n && mat[newr][newc] == 1 && f + 1 < dis[newr][newc]) {
                    dis[newr][newc] = f + 1;
                    if (newr == destR && newc == destC)
                        return f + 1;
                    q.add(new Tuple(f + 1, newr, newc));
                }
            }
        }

        return -1; // If no path is found
    }
}

public class q4ShortestPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int srcR = sc.nextInt();
        int srcC = sc.nextInt();
        int destR = sc.nextInt();
        int destC = sc.nextInt();

        Result ob = new Result();
        int result = ob.shortestPath(mat, srcR, srcC, destR, destC, m, n);
        if (result != -1) {
            System.out.println("Shortest path length is " + result);
        } else {
            System.out.println("No path found.");
        }

        sc.close();
    }
}
