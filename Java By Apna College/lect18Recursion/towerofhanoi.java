import java.util.*;

public class towerofhanoi {
    public static int cnt = 0;

    public static void solve(int n, String src, String helper, String dest) {

        if (n == 1) {
            cnt++;
            System.out.println("Move disk 1 from source " + src + " to destination " + dest);
            return;
        }

        cnt++;
        solve(n - 1, src, dest, helper);
        System.out.println("Move disk " + n + " from source " + src + " to destination " + dest);
        solve(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        solve(n, "s", "h", "d");
        System.out.println(cnt);
    }
}
