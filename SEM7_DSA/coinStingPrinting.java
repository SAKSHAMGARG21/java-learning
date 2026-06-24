public class coinStingPrinting {
    public static void solveCoin(int t, int[] arr, String str) {
        if (t <= 0) {
            System.out.println(str);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            char ch = (char)(arr[i]+'0');
            solveCoin(t - arr[i], arr, str + ch +' ');
        }
    }

    public static void main(String[] args) {
        int t = 10;
        int[] arr = { 2, 3, 5, 8 };

        solveCoin(t,arr, "");
    }
}
