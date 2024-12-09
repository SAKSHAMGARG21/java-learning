import java.util.Arrays;

public class Solution {
    static int solve(int[] val, int[] wt, int cap, int idx, int[][] dp) {
        if (idx == 0) {
            if (wt[0] <= cap) {
                return val[0];
            } else {
                return 0;
            }
        }

        if (dp[idx][cap] != -1) {
            return dp[idx][cap];
        }

        int inc = 0;
        if (wt[idx] <= cap) {
            inc = val[idx] + solve(val, wt, cap - wt[idx], idx - 1, dp);
        }

        int exc = 0 + solve(val, wt, cap, idx - 1, dp);

        dp[idx][cap] = Math.max(inc, exc);
        return dp[idx][cap];

    }

    static int solveTabulation(int[] val, int[] wt, int cap, int n) {

        int[][] dp = new int[n][cap + 1];

        for (int i = wt[0]; i <= cap; i++) {
            if (wt[0] <= cap) {
                dp[0][i] = val[0];
            } else {
                dp[0][i] = 0;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int w = 0; w <= cap; w++) {
                int inc = 0;
                if (wt[i] <= w) {
                    inc = val[i] + dp[i - 1][w - wt[i]];
                }

                int exc = dp[i - 1][w];

                dp[i][w] = Math.max(inc, exc);
            }
        }
        return dp[n - 1][cap];
    }

    static int solveTabulationspaceOtm(int[] val, int[] wt, int cap, int n) {

        int[] prev = new int[cap + 1];

        for (int i = wt[0]; i <= cap; i++) {
            if (wt[0] <= cap) {
                prev[i] = val[0];
            } else {
                prev[i] = 0;
            }
        }

        for (int i = 1; i < n; i++) {
            int[] curr = new int[cap + 1];
            for (int w = 0; w <= cap; w++) {
                int inc = 0;
                if (wt[i] <= w) {
                    inc = val[i] + prev[w - wt[i]];
                }

                int exc = prev[w];
                curr[w] = Math.max(inc, exc);
            }
            prev = curr;
        }
        return prev[cap];
    }

    static int solveTabulationspaceOtmPlus(int[] val, int[] wt, int cap, int n) {

        int[] curr = new int[cap + 1];

        for (int i = wt[0]; i <= cap; i++) {
            if (wt[0] <= cap) {
                curr[i] = val[0];
            } else {
                curr[i] = 0;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int w = cap; w >= 0; w--) {
                int inc = 0;
                if (wt[i] <= w) {
                    inc = val[i] + curr[w - wt[i]];
                }

                int exc = curr[w];

                curr[w] = Math.max(inc, exc);
            }
        }
        return curr[cap];
    }

    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int[][] dp = new int[maxWeight + 1][maxWeight + 1];
        for (int i = 0; i <= maxWeight; i++) {
            Arrays.fill(dp[i], -1);
        }
        // return solve(value, weight, maxWeight, n - 1, dp);
        // return solveTabulation(value, weight,maxWeight,n);
        return solveTabulationspaceOtm(value, weight, maxWeight, n);
    }
}

public class kanpSack {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("[ ");
                for (int j2 = j; j2 < i + j; j2++) {
                    System.out.print(arr[j2] + " ");
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }
}
