import java.util.*;
class Solution {

    // Recursion
    public int solve1(int[] cost, int n, int[] dp) {
        if (n == 0) {
            return cost[0];
        }
        if (n == 1) {
            return cost[1];
        }

        return cost[n] + Math.min(solve1(cost, n - 1, dp), solve1(cost, n - 2, dp));
    }

    // Recursion and memoization
    public int solve2(int[] cost, int n, int[] dp) {
        if (n == 0) {
            return cost[0];
        }
        if (n == 1) {
            return cost[1];
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = cost[n] + Math.min(solve2(cost, n - 1, dp), solve2(cost, n - 2, dp));
        return dp[n];
    }

    // Tabulation
    public int solve3(int[] cost, int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }

    public int minCostClimbingStairs(int[] cost) {

        // int n=cost.length;
        // int[] dp= new int[n+1];
        // Arrays.fill(dp,-1);
        // int ans= Math.min(solve1(cost,n-1,dp),solve1(cost,n-2,dp));
        // return ans;

        // int n=cost.length;
        // int[] dp= new int[n+1];
        // Arrays.fill(dp,-1);
        // int ans= Math.min(solve2(cost,n-1,dp),solve2(cost,n-2,dp));
        // return ans;

        int n = cost.length;

        int ans = solve3(cost, n);
        return ans;
    }
}

public class q1mincosttofindclimbStairs {
    public static void main(String[] args) {

    }
}
