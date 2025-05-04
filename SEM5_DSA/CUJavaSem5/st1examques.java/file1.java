import java.util.*;

interface sort {
    void Merge(int a[], int b[]);
    void sort_array();
}

// cretea Sorting_Class and implemt sort
class Sorting_Class implements sort {

    public void sort_array() {
    }

    public void Merge(int a[], int b[]) {
        int al = a.length;
        int bl = b.length;
        int[] ans = new int[al + bl];

        int idx = 0;
        for (int i = 0; i < al; i++) {
            ans[idx++] = a[i];
        }
        for (int i = 0; i < bl; i++) {
            ans[idx++] = b[i];
        }

        Arrays.sort(ans);

        for (int i = 0; i < idx; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

public class file1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int[] arr1 = new int[n1];
        // int[] arr2 = new int[n2];
        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i]=sc.nextInt();
        // }
        // for (int i = 0; i < arr2.length; i++) {
        // arr2[i]=sc.nextInt();
        // }
        // sort obj=new Sorting_Class();
        // obj.Merge(arr1, arr2);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        int d = n - a - 1;
        for (int i = 0; i < n; i++) {
            ans[(i + d) % n] = arr[i];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
