import java.util.*;

class countTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long res = 0;
        res = countTplets(arr, n, sum);
        System.out.print(res);
    }

    public static long countTplets(long arr[], int n, int sum) {
        Arrays.sort(arr);
        long c = 0;
        for (int i = 0; i < n - 2; i++) {
            int k = i + 1;
            int j = n - 1;
            while (k < j) {
                long s = arr[i] + arr[j] + arr[k];
                if (s < sum) {
                    c += j - k;
                    k++;
                } else {
                    j--;
                }
            }
        }
        return c;
    }
}