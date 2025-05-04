// import java.util.*;

// public class clibstaircase {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         System.out.println(count(n));
//     }

//     public static int count(int step) {
//         if (step < 0) {
//             return 0;
//         }

//         if (step == 0) {
//             return 1;
//         }

//         int res = count(step - 1) + count(step - 2);
//         return res;
//     }
// }

import java.util.*;

public class clibstaircase {

    public int climbStairs(int n) {
        int a = 0, b = 1;
        if (n == 0)
            return a;
        if (n == 1)
            return b;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean two = true;
        System.out.println(count(n, two));
    }

    public static int count(int step, boolean two) {
        if (step < 0) {
            return 0;
        }

        if (step == 0) {
            return 1;
        }

        int res = 0;
        res += count(step - 1, true);
        if (two) {
            res += count(step - 2, false);
        }
        return res;
    }

}
