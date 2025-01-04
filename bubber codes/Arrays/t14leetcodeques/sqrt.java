import java.util.*;

public class sqrt {

    public static int sqrt(int n) {
        int s = 0;
        int e = n;
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static double decimal(int n, int res, int p) {

        double frac = 1;
        double ans = res;
        for (int i = 0; i < p; i++) {
            frac /= 10;
            for (double j = ans; j * j < n; j += frac) {
                ans = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(37));
        System.out.format("%.3f", decimal(37, sqrt(37), 3));
        System.out.println();
        double x = Math.sqrt(37);
        String str = String.format("%.3f", x);
        double res = Double.parseDouble(str);
        System.out.println(res);
    }
}
