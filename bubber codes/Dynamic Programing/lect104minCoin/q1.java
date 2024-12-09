import java.util.*;

public class q1 {
    public static int solveRec(int[] arr, int t) {
        if (t == 0) {
            return 0;
        }

        if (t < 0) {
            return Integer.MAX_VALUE;
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int ans = solveRec(arr, t - arr[i]);
            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, 1 + ans);
            }
        }

        return mini;
    }

    public static int solveMemo(int[] arr, int[] dp, int t) {
        if (t == 0) {
            return 0;
        }

        if (t < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[t] != -1) {
            return dp[t];
        }

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int ans = solveMemo(arr, dp, t - arr[i]);
            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, 1 + ans);
            }
        }
        dp[t] = mini;

        return dp[t];
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
        int[] arr = { 1, 2, 3 };

        int n = 7;
        // int res = solveRec(arr, n);
        // if (res == Integer.MAX_VALUE) {
        // System.out.println(-1);
        // }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        Arrays.fill(dp, Integer.MAX_VALUE);
        int res = solveTab(arr, dp, n);
        System.out.println(res);
    }
}
