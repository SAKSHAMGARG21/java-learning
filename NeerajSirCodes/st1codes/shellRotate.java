import java.util.Scanner;
import java.util.*;

// 6 6 
// 1 2 3 4 5 6 
// 7 8 9 10 11 12 
// 13 14 15 16 17 18 
// 19 20 21 22 23 24
// 25 26 27 28 29 30
// 31 32 33 34 35 36
// 2
// 1

// 4 4
// 1 2 3 4
// 5 6 7 8 
// 9 10 11 12 
// 13 14 15 16
// 2
// 1
public class shellRotate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt();
        int r = sc.nextInt();

        rotate(arr, s, r);

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] arr, int s, int r) {
        int[] oned = storeinoned(arr, s);
        oned = rotation(oned, r);
        storein2d(oned, arr, s);
    }

    private static void storein2d(int[] oned, int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int idx = 0;

        // left wall
        for (int i = minr; i <= maxr; i++) {
            arr[i][minc] = oned[idx];
            idx++;
        }

        // bottom wall
        for (int i = minc + 1; i <= maxc; i++) {
            arr[maxr][i] = oned[idx];
            idx++;
        }

        // right wall
        for (int i = maxr - 1; i >= minr; i--) {
            arr[i][maxc] = oned[idx];
            idx++;
        }

        // top wall
        for (int i = maxc - 1; i > minc; i--) {
            arr[minr][i] = oned[idx];
            idx++;
        }
    }

    public static int[] rotation(int[] temp, int r) {
        int[] arr = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            arr[(i + r) % temp.length] = temp[i];
        }
        return arr;
    }

    private static int[] storeinoned(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int size = 2 * (maxc - minc + maxr - minr);
        int[] oned = new int[size];

        int idx = 0;

        // left wall
        for (int i = minr; i <= maxr; i++) {
            oned[idx] = arr[i][minc];
            idx++;
        }

        // bottom wall
        for (int i = minc + 1; i <= maxc; i++) {
            oned[idx] = arr[maxr][i];
            idx++;
        }

        // right wall
        for (int i = maxr - 1; i >= minr; i--) {
            oned[idx] = arr[i][maxc];
            idx++;
        }

        // top wall
        for (int i = maxc - 1; i > minc; i--) {
            oned[idx] = arr[minr][i];
            idx++;
        }

        return oned;
    }
}
