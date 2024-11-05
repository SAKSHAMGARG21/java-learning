public class waystocountguest {

    public static int countways(int n) {

        if (n <= 1) {
            return 1;
        }

        // single
        int ways1 = countways(n - 1);

        // double
        int ways2 = (n - 1) * countways(n - 2);
        return ways1 + ways2;
    }

    public static void main(String[] args) {

        int n = 4;
        int ans = countways(n);
        System.out.println(ans);
    }
}
