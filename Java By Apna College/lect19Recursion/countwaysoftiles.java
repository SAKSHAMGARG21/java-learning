public class countwaysoftiles {
    public static int countWays(int n, int m) {
        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }
        int vt = countWays(n - m, m);
        int ht = countWays(n - 1, m);
        return vt + ht;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        int ans = countWays(n, m);
        System.out.println(ans);
    }
}
