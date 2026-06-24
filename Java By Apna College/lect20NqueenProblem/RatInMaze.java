import java.util.*;

class RatInMaze{
    private static boolean isSafe(int x, int y, int n, int[][] visited, int[][] m) {
        return (x >= 0 && x < n && y >= 0 && y < n && visited[x][y] == 0 && m[x][y] == 1);
    }

    // private void solve(int[][] m, int n, int x, int y, int[][] visited, List<String> ans, String path) {
    //     if (x == n - 1 && y == n - 1) {
    //         ans.add(path.toString());
    //         return;
    //     }

    //     visited[x][y] = 1;

    //     // Down
    //     int nx = x + 1, ny = y;
    //     if (isSafe(nx, ny, n, visited, m)) {
    //         solve(m, n, nx, ny, visited, ans, path+'D');
    //     }

    //     // Left
    //     nx = x; ny = y - 1;
    //     if (isSafe(nx, ny, n, visited, m)) {
    //         solve(m, n, nx, ny, visited, ans, path+'L');
    //     }

    //     // Right
    //     nx = x; ny = y + 1;
    //     if (isSafe(nx, ny, n, visited, m)) {
    //         solve(m, n, nx, ny, visited, ans, path+'R');
    //     }

    //     // Up
    //     nx = x - 1; ny = y;
    //     if (isSafe(nx, ny, n, visited, m)) {
    //         solve(m, n, nx, ny, visited, ans, path+'U');
    //     }

    //     visited[x][y] = 0;
    // }

    private static void solve(int[][] m, int n, int x, int y, int[][] visited, List<String> ans, StringBuilder path) {
        if (x == n - 1 && y == n - 1) {
            ans.add(path.toString());
            return;
        }

        visited[x][y] = 1;

        // Down
        int nx = x + 1, ny = y;
        if (isSafe(nx, ny, n, visited, m)) {
            path.append('D');
            solve(m, n, nx, ny, visited, ans, path);
            path.deleteCharAt(path.length() - 1);
        }

        // Left
        nx = x; ny = y - 1;
        if (isSafe(nx, ny, n, visited, m)) {
            path.append('L');
            solve(m, n, nx, ny, visited, ans, path);
            path.deleteCharAt(path.length() - 1);
        }

        // Right
        nx = x; ny = y + 1;
        if (isSafe(nx, ny, n, visited, m)) {
            path.append('R');
            solve(m, n, nx, ny, visited, ans, path);
            path.deleteCharAt(path.length() - 1);
        }

        // Up
        nx = x - 1; ny = y;
        if (isSafe(nx, ny, n, visited, m)) {
            path.append('U');
            solve(m, n, nx, ny, visited, ans, path);
            path.deleteCharAt(path.length() - 1);
        }

        visited[x][y] = 0;
    }

    public static List<String> findPath(int[][] m, int n) {
        List<String> ans = new ArrayList<>();
        if (m[0][0] == 0) return ans;

        int[][] visited = new int[n][n];
        StringBuilder path = new StringBuilder();
        solve(m, n, 0, 0, visited, ans, path);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] m = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    m[i][j] = sc.nextInt();
                }
            }

            // Solution obj = new Solution();
            List<String> result = findPath(m, n);
            Collections.sort(result);

            if (result.size() == 0) {
                System.out.print("-1");
            } else {
                for (String s : result) {
                    System.out.print(s + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
// 1
// 4
// 1 0 0 0
// 1 1 0 1
// 1 1 0 0
// 0 1 1 1