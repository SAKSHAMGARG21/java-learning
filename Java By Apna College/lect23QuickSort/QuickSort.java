import java.util.Scanner;

public class QuickSort {

    public static int pivot(int[] arr, int s, int e) {
        int tmx = arr[s];
        int c = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= tmx) {
                c++;
            }
        }
        int pivt = s + c;
        int t = arr[s];
        arr[s] = arr[pivt];
        arr[pivt] = t;

        int i = s, j = e;

        while (i < pivt && j > pivt) {
            while (i < pivt && arr[i] <= tmx) {
                i++;
            }
            while (j > pivt && arr[j] > tmx) {
                j--;
            }
            if (i < pivt && j > pivt) {
                swap(arr, i++, j--);
            }
        }
        return pivt;
    }

    public static void quicksort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }

        int p = pivot(arr, s, e);

        quicksort(arr, s, p - 1);
        quicksort(arr, p + 1, e);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = scanner.nextInt();
        // }
        int[] arr = { 3, 2, 4, 5, 6, 9 };

        quicksort(arr, 0, 6 - 1);

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }

        // scanner.close();
    }
}