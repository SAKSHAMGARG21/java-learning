import java.util.Arrays;

public class q1fibonacci {
    public static int fibonacci(int n, int[] dp) {

        // top to bottom or Recursion and memoization
        // if (n<=1){
        // return n;
        // }

        // if(dp[n]!=-1){
        // return dp[n];
        // }

        // dp[n]=fibonacci(n-1, dp)+fibonacci(n-2, dp);
        // return dp[n];

        // bottom to top tabulation
        // dp[0] = 0;
        // dp[1] = 1;

        // for (int i = 2; i <=n; i++) {
        //     dp[i]=dp[i-1]+dp[i-2];
        // }

        // return dp[n];

        // T O(n) S(1)
        int a,b,c=0;
        a=0;
        b=1;
        for (int i = 2; i < dp.length; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int res = fibonacci(n, dp);
        System.out.println(res);
    }
}
