import java.util.*;

import java.util.*;

class Solution {
    public int solveRec(int n, int x, int y, int z) {

        if (n == 0) {
            return 0;
        }

        if (0 > n) {
            return Integer.MIN_VALUE;
        }

        int s1 = solveRec(n - x, x, y, z);
        int s2 = solveRec(n - y, x, y, z);
        int s3 = solveRec(n - z, x, y, z);

        int mx = 1 + Math.max(s1, Math.max(s2, s3));
        return mx;
    }

    public int solveMemo(int n, int x, int y, int z, int[] dp) {

        if (n == 0) {
            return 0;
        }

        if (0 > n) {
            return Integer.MIN_VALUE;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int s1 = solveMemo(n - x, x, y, z, dp);
        int s2 = solveMemo(n - y, x, y, z, dp);
        int s3 = solveMemo(n - z, x, y, z, dp);

        int mx = 1 + Math.max(s1, Math.max(s2, s3));
        dp[n] = mx;
        return mx;
    }

    public int solveTab(int n, int x, int y, int z) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (i - x >= 0) {
                dp[i] = Math.max(dp[i], dp[i - x] + 1);
            }
            if (i - y >= 0) {
                dp[i] = Math.max(dp[i], dp[i - y] + 1);
            }
            if (i - z >= 0) {
                dp[i] = Math.max(dp[i], dp[i - z] + 1);
            }
        }
        if (dp[n] < 0) {
            return 0;
        }
        return dp[n];
    }

    public int cutSegments(int n, int x, int y, int z) {
        // Write your code here.
        // int res=solveRec(n,x,y,z);

        // int[] dp = new int[n + 1];
        // Arrays.fill(dp, -1);
        // int res=solveMemo(n, x, y, z, dp);

        int res = solveTab(n, x, y, z);
        return (res > 0) ? res : 0;
    }
}

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        Solution sb = new Solution();
        System.out.println(sb.cutSegments(n, x, y, z));
    }
}
