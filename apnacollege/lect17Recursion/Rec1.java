import java.util.*;

public class Rec1 {

    public static void solve(int n) {
        if (n == 0)
            return;
        solve(n - 1);
        System.out.println(n);
    }

    public static void printsum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        printsum(i + 1, n, sum);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;

        int fact = n * factorial(n - 1);
        return fact;
    }

    public static int sum(int n) {
        if (n == 0)
            return 0;
        int sm = n + sum(n - 1);
        return sm;
    }

    public static int fibonaci(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonaci(n - 1) + fibonaci(n - 2);
    }

    public static void sequence(int a, int b, int n) {
        if (n == 0)
            return;

        int c = a + b;
        System.out.println(c);
        sequence(b, c, n - 1);
    }

    public static int calcPow(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int pow = x * calcPow(x, n - 1);
        return pow;
    }

    public static int calcPowlog(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return calcPowlog(x, n / 2) * calcPowlog(x, n / 2);
        } else {
            return calcPowlog(x, n / 2) * calcPowlog(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // solve(n);

        // printsum(1,5,0);
        // int ans=factorial(3);
        // System.out.println(ans);

        // int add=sum(5);
        // System.out.println(add);

        // int fib=fibonaci(1);
        // System.out.println(fib);

        // int a=0,b=1;
        // System.out.println(a);
        // System.out.println(b);
        // sequence(a,b,7-2);

        // int pow=calcPow(2, 5);
        int logpow = calcPowlog(2, 5);
        System.out.println(logpow);
    }
}
