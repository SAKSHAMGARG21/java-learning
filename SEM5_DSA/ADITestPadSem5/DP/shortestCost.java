import java.util.*;

// tle
// class shortestCost {
//     static boolean isSafe(int x, int y, int m, int n) {
//         return (x >= 0 && x < m && y >= 0 && y < n);
//     }

//     static int findMinCost(int cost[][], int x, int y, int m, int n, int[][] dp) {
//         if (x == m - 1 && y == n - 1) {
//             return cost[x][y];
//         }

//         if (dp[x][y] != -1) {
//             return dp[x][y];
//         }

//         int right = Integer.MAX_VALUE, down = Integer.MAX_VALUE, diagonal = Integer.MAX_VALUE;

//         if (isSafe(x + 1, y, m, n)) {
//             down = findMinCost(cost, x + 1, y, m, n, dp);
//         }

//         if (isSafe(x, y + 1, m, n)) {
//             right = findMinCost(cost, x, y + 1, m, n, dp);
//         }

//         if (isSafe(x + 1, y + 1, m, n)) {
//             diagonal = findMinCost(cost, x + 1, y + 1, m, n, dp);
//         }

//         dp[x][y] = cost[x][y] + Math.min(right, Math.min(down, diagonal));
//         return dp[x][y];
//     }

//     static int minCostPath(int cost[][], int m, int n) {
//         int[][] dp = new int[m][n];
//         for (int i = 0; i < m; i++) {
//             Arrays.fill(dp[i], -1);
//         }

//         return findMinCost(cost, 0, 0, m, n, dp);
//     }

//     public static void main(String[] args) {
//         int[][] cost = {
//             {1, 2, 3},
//             {4, 8, 2},
//             {1, 5, 3}
//         };
//         int m = cost.length;
//         int n = cost[0].length;
//         int result = minCostPath(cost, m, n);
//         System.out.println("The minimum cost path is: " + result);  // Should print 8
//     }
// }


// import java.util.*;


class shortestCost {
    public static int minCostPath(int[][] cost, int m, int n) {
        int[][] dp = new int[m][n];

        // Initialize the cost of the first cell
        dp[0][0] = cost[0][0];

        // Initialize the first row of the dp array
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + cost[0][j];
        }

        // Initialize the first column of the dp array
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + cost[i][0];
        }

        // Fill the rest of the dp array
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = cost[i][j] + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
            }
        }

        // The minimum cost path to the bottom-right corner
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] cost = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        int result = minCostPath(cost, m, n);
        System.out.println(result);

        sc.close();
    }
}
