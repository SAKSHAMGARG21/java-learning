import java.util.Arrays;

public class MatrixChainMultiplication {

    public static int matrixChainMultiplication(int arr[], int m) {
        int dp[][] = new int[m + 1][m + 1];

        // Initialize the dp array
        for (int i = 1; i <= m; i++) {
            dp[i][i] = 0;
        }

        // Applying the dynamic programming approach
        for (int length = 2; length <= m; length++) {
            for (int i = 1; i <= m - length + 1; i++) {
                int j = i + length - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[1][m];
    }

    public static void main(String[] args) {
        // Sample Input
        int[] arr = { 10, 20, 30, 40 };
        int n = arr.length - 1;

        // Function Call
        System.out.println("Minimum number of multiplications is " + matrixChainMultiplication(arr, n));
    }
}
