
public class file {

    public static void mergearr(int[] arr, int st, int ed, int mid) {

        int[] merged = new int[ed - st + 1];

        int idx1 = st;
        int idx2 = mid + 1;

        int x = 0;

        while (idx1 <= mid && idx2 <= ed) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ed) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = st; i < merged.length; j++, i++) {
            arr[j] = merged[i];
        }
    }

    public static void mergeSort(int[] arr, int st, int ed) {

        if (st >= ed) {
            return;
        }

        int mid = st + (ed - st) / 2;

        mergeSort(arr, st, mid);
        mergeSort(arr, mid + 1, ed);

        mergearr(arr, st, ed, mid);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 6, 9 };

        mergeSort(arr, 0, 5);
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
