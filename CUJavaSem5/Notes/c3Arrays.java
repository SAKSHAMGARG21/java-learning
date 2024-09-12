import java.lang.reflect.Array;
import java.util.*;

public class c3Arrays {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // System.out.println(Arrays.toString(arr));

        int[] arr = { 1, 2, 3, 4, 5, 6, -7, -8, -9 };
        int n = arr.length;
        int[] temp = new int[n];
        int i = 0;
        int j = n - 1;
        // for (int k = 0; k < n; k++) {
        // if (arr[k] % 2 != 0) {
        // temp[i++] = arr[k];
        // } else {
        // temp[j--] = arr[k];
        // }
        // }
        // for (int k = 0; k < n; k++) {
        // arr[k] = temp[k];
        // }

        while (i < j) {
            int e1 = arr[i], e2 = arr[j];
            if (((e1 & 1) == 0) && ((e2 & 1) == 1)) {
                i++;
                j--;
            } else if (((e1 & 1) != 0) && ((e2 & 1) == 0)) {
                swap(arr, i, j);
                i++;
            } else {
                swap(arr, i, j);
                j--;
            }
        }

        // int[] digits = { 1, 2, 3, 4, 5 };
        // System.out.println("Before swap: " + java.util.Arrays.toString(digits));

        // // Swap the digits at index 1 and 3
        // swap(digits, 1, 3);

        // System.out.println("After swap: " + java.util.Arrays.toString(digits));

        Arrays.sort(arr, 0, i);
        Arrays.sort(arr, i, n);

        System.out.println(Arrays.toString(arr));

        // int[] arr={1,2,3,4,5,6,7};
        // int d=2;
        // int n=arr.length;
        // int[] temp=new int[n];
        // for (int i = 0; i < arr.length; i++) {
        // temp[(i+d)%n]=arr[i];
        // }

        // System.out.println(Arrays.toString(temp));

        // int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // int d = 2;
        // int n = arr.length;
        // int k = n - d;
        // int[] temp = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        // temp[(i + k) % n] = arr[i];
        // }

        // System.out.println(Arrays.toString(temp));

        // int x = arr[0];
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (count == 0) {
        // x = arr[i];
        // count = 1;
        // } else if (x == arr[i]) {
        // count++;
        // } else {
        // count--;
        // }
        // }

        // int freq = 0;
        // for (int i : arr) {
        // if (i == x)
        // freq++;
        // }

        // if (freq >= n / 2)
        // System.out.println(x);
        // else
        // System.out.println(-1);

        // int mxsum = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        // int sum = arr[i];
        // for (int j = i + 1; j < arr.length; j++) {
        // sum += arr[j];
        // mxsum = Math.max(mxsum, sum);
        // }
        // }
        // System.out.println(mxsum);

    }
}
