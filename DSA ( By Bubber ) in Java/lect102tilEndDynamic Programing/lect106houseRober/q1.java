import java.util.*;

public class q1 {
    public static int solveRec(int[] arr, int sum, int idx, int n) {
        if (idx >= n) {
            return sum;
        }

        // include
        int inc = solveRec(arr, sum + arr[idx], idx + 2, n);

        // exclude
        int exc = solveRec(arr, sum, idx + 1, n);

        sum = Math.max(inc, exc);
        return sum;
    }

    static int solveMemo(int[] arr, int idx, int n, int[] dp) {
        if (idx >= n) {
            return 0;
        }

        if (dp[idx] != -1) {
            return dp[idx];
        }

        // include
        int inc = arr[idx] + solveMemo(arr, idx + 2, n, dp);

        // exclude
        int exc = solveMemo(arr, idx + 1, n, dp);

        dp[idx] = Math.max(inc, exc);
        return dp[idx];
    }

    public static int solveTab(int[] arr, int[] dp, int t) {

        for (int i = 1; i <= t; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i - arr[j] >= 0 && dp[i - arr[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - arr[j]]);
                }
            }
        }

        if (dp[t] == Integer.MAX_VALUE) {
            return -1;
        }

        return dp[t];
    }

    public static void main(String[] args) {
        int[] arr = { 9, 9, 8, 2 };
        int n = 4;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int sum = 0;
        // int res = solveRec(arr, sum, 0, n);
        int res = solveMemo(arr, 0, n, dp);
        System.out.println(res);

        // int[] dp = new int[n + 1];
        // dp[0] = 0;
        // Arrays.fill(dp, Integer.MAX_VALUE);
        // int res = solveTab(arr, dp, n);
        // System.out.println(res);
    }
}
